package fi.jyu.pservice;

public class PServiceImpl implements PService {

	@Override
	public double ComputeTriangleAreaByBaseAndHeight(int base, int height) {
		// TODO Auto-generated method stub
		return (base * height) / 2;
	}

	@Override
	public double ComputeSquareArea(int side) {
		// TODO Auto-generated method stub
		return (side * 4);
	}

	@Override
	public double ComputeCircleArea(int radius) {
		// TODO Auto-generated method stub
		 return (radius * radius * Math.PI);
	}
}
