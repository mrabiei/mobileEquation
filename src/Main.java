import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {

// Ghz = 10^9 Hz  , Mhz = 10 ^6 Hz , Khz= 10^3 Hz
// mm to meter = 10^-3 , cm to meter=10^-2 , cm^2 = 10^-4
// KM to meter = 10^3	

		final DecimalFormat df = new DecimalFormat("0.00");

		System.out.println(FreeSpaceEquation.waveLength(4 * Math.pow(10, 9)));
		System.out.println(
				(FreeSpaceEquation.antennaGainUnitLess(10, FreeSpaceEquation.waveLength(4 * Math.pow(10, 9)))));

		System.out.println(FreeSpaceEquation.antennaGainDBl(22329));

		System.out.println(df.format(FreeSpaceEquation.twoDiffrencePowerSignal(1, 2)));
		System.out.println(df.format(FreeSpaceEquation.powerDensityLossLess(8, 100530.9, 2000)));
		System.out.println("Unit less "+df.format(FreeSpaceEquation.convertDesibleToUnitless(44)));
		System.out.println("db "+df.format(FreeSpaceEquation.antennaGainDBl(25118.86)));
		
		System.out.println("Unit less "+df.format(FreeSpaceEquation.convertDesibleToUnitless(48)));
		
		System.out.println((FreeSpaceEquation.powerRecievedTramitReflectedModel(17699.12, 5.65, Math.pow(10, 2.55/10), 50, 1.5, 5000)));

		System.out.println(FreeSpaceEquation.pathLossPropogationIsotropic(35896000, 4*Math.pow(10, 9)));
		
		
		
	}
}
