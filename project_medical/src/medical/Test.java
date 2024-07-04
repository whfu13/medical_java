package medical;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<SampleData> dataset = new SampleData().get_dataset();
		SampleData sd = new SampleData();
		String name = "", address="";
		int facility_code = 0;
		int region_code = 0;
		System.out.printf("%s\t%s\t%d\t%d\n",sd.getName(),sd.getAddress(),sd.getFacility_code(),sd.getRegion_code());
	}


}
