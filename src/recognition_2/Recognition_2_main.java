package recognition_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import com.ibm.watson.developer_cloud.service.security.IamOptions;
import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifiedImages;
import com.ibm.watson.developer_cloud.visual_recognition.v3.model.ClassifyOptions;

public class Recognition_2_main {
	
	public static void main(String[] args ) {
		

		Recognition_2_lib rlib = new Recognition_2_lib();

		rlib.getResult("img/aa.jpg");
	}

}
