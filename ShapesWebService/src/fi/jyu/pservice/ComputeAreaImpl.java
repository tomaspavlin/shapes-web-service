package fi.jyu.pservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import fi.jyu.utility.*;

@WebService
public class ComputeAreaImpl implements ComputeArea {
	@Override
	@WebMethod
	public String ComputeTriangleAreaByBaseAndHeight(Double base, Double height) {
		// TODO Auto-generated method stub
		return Utility.converToXml((base * height) / 2);
	}

	@Override
	@WebMethod
	public String ComputeSquareArea(Double side) {
		// TODO Auto-generated method stub
		return Utility.converToXml((side * side));
	}

	@Override
	@WebMethod
	public String ComputeCircleArea(Double radius) {
		// TODO Auto-generated method stub
		 return Utility.converToXml((radius * radius * Math.PI));
	}
}
