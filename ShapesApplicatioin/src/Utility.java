import java.io.StringReader;

import javax.servlet.http.HttpServletRequest;

import org.jdom2.*;
import org.jdom2.input.*;

import net.webservicex.area.*;
import net.webservicex.length.*;

public final class Utility {
	private AreaUnitSoap areaUnitConverter;
	private LengthUnitSoap lengthUnitConverter;

	public Utility(LengthUnitSoap lengthUnitConverter, AreaUnitSoap areaUnitConverter){
		this.areaUnitConverter = areaUnitConverter;
		this.lengthUnitConverter = lengthUnitConverter;
	}
	 
	private double parseResponse (String res) {
		double result;
		
		try {
			SAXBuilder saxBuilder = new SAXBuilder();
			Document doc = saxBuilder.build(new StringReader(res));
			result = Double.parseDouble(doc.getRootElement().getText());
		} catch (Exception e) {
			throw new Error("Can't parse the response.");
		}
		
		return result;
	}
	
	public double getArgInMeters (HttpServletRequest request, String name) {
		return this.lengthUnitConverter.changeLengthUnit(
    		Double.parseDouble(request.getParameter(name)),
    		Lengths.fromValue(request.getParameter(name + "Unit")),
    		Lengths.METERS);
	}
	
	public double parseResults (String unit, String result) {
		return this.areaUnitConverter.changeAreaUnit(
    		this.parseResponse(result), Areas.SQUAREMETER, Areas.fromValue(unit));
	}
}
