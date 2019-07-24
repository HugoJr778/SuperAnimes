package stepsPassosDownload;

public class GetSetSuperAnimes {
	
	private static int quantEp;
	private static String epComecar;
	private static String statusErroAba = "NOK";
	
	public static int getQuantEp() {
		return quantEp;
	}

	public static void setQuantEp(int quantEp) {
		GetSetSuperAnimes.quantEp = quantEp;
	}

	public static String getEpComecar() {
		return epComecar;
	}

	public static void setEpComecar(String epComecar) {
		GetSetSuperAnimes.epComecar = epComecar;
	}

	public static String getStatusErroAba() {
		return statusErroAba;
	}

	public static void setStatusErroAba(String statusErroAba) {
		GetSetSuperAnimes.statusErroAba = statusErroAba;
	}
}