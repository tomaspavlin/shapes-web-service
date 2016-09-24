package fi.jyu.utility;

 public final class Utility {
	private Utility(){}
	 
	public static String converToXml (Double area){
		return "<double>" + String.valueOf(area) + "</double>";		
	}
}
