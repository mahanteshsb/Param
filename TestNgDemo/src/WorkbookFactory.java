

import java.io.FileInputStream;
import java.io.FileOutputStream;

public interface WorkbookFactory {

	static WorkbookFactory create(FileInputStream fis) {
		// TODO Auto-generated method stub
		return null;
	}

	void write(FileOutputStream fos);

	Object getSheet(String string);

	void close();

}
