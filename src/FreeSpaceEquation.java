
public class FreeSpaceEquation {

	public static double waveLength(double frequecy) {

		// equation landa(waveLenght= (c)speed/frequency)

		// speed of light 10^8
		double speed = 3 * Math.pow(10, 8);

		return (speed / frequecy);
	}

	public static double antennaGainUnitLess(double Ae, double landa) {

		// G = 4 * 3.14 Ae(affected Area)/landa^2

		return ((4 * 3.14 * Ae) / Math.pow(landa, 2));
	}

	public static double antennaGainDBl(double unitLess) {
		// Math.round(a * 100.0) / 100.0
		return ((10 * (Math.log10(unitLess))));
	}

	public static double powerDensity(double power, double r) {
		// signal power transmitting
		// Pt = total power emitted by antenna (w)
		// Sr=Pt/area of sphere(4* Math.pi * r^2 )
		// ISI unit W/m^2

		return (power / (4 * Math.PI * Math.pow(r, 2)));
	}

	public static double powerDensityLossLess(double power, double antennaGainTransmitter, double radius) {
		// it's the same with power Density
		// equation Pa=Sr.Gt=> Pt/(4. Math.Pi . r^2) . Gt =>Pt.Gt/(4.math.Pi.r^2)
		// ISI unit W/m2

		return ((power * antennaGainTransmitter) / ((4 * Math.PI) * Math.pow(radius, 2)));
	}

	public static double EIRP(double power, double antennaGain) {
		// EIRP = > equivalent isotropic radiation power
		return power * antennaGain;
	}

	public static double EFI(double Pa, double Gt, double distance) {
		// Rm is impedance it's constant R=377 (ohms)
		// EFI electric field intensity , the strength of signal
		// E=sqrt(pa.Rm) =>sqrt(pt.gt.Rm/(4.Pi.R^2)) ISI unit V/m
		int Rm = 377;
		return Math.sqrt((Pa * Gt * Rm) / 4 * Math.PI * (Math.pow(distance, 2)));
	}

	public static double powerReceivedTransmit(double powerTransmision, double gainTransmision, double gainReceived,
			double waveLenght, double radius) {
		// power received at receiving antenna
		// Pr=Pt.Gt.Gr.(landa/4Pi.r)^2
		double equation = powerTransmision * gainTransmision * gainReceived
				* (Math.pow(waveLenght / (4 * Math.PI) * radius, 2));

		return equation;

	}

	public static double powerRecievedTramitReflectedModel(double powerTransmit, double antennaGainTransmit,
			double antennaGainRecieced, double heigh1, double heigh2, double distance) {
		// Pr=Pt.Gt.Gr.h1^2.h2^2/math.power(distance,4)
		double equation = powerTransmit * antennaGainRecieced * antennaGainTransmit * Math.pow(heigh1, 2)
				* Math.pow(heigh2, 2) / Math.pow(distance, 4);

		return equation;
	}

	public static double twoDiffrencePowerSignal(double d1, double d2) {
		// calculate the diffrence between two received signal power
		// the result unit is dB
		double equation = 20 * Math.log10(d2 / d1);

		return equation;
	}

	public static double convertDesibleToUnitless(double desible) {

		return Math.pow(10, desible / 10);
	}

	public static double pathLossPropogationIsotropic(double distance, double frequency) {

		double equation = -20 * Math.log10((3 * Math.pow(10, 8)) / 4 * Math.PI) + 20 * Math.log10(frequency)
				+ 20 * Math.log10(distance);

		return equation;
	}

}
