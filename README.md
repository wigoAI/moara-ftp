# moara-ftp
- 보안 작업은 하지 않았으므로 내부망 환경에서만 사용 해야 합니다.

# 개발환경
-   open jdk 1.8

# 구성
1. ftp server 
2. ftp client

 
# 사용법
```java
import org.moara.ftp.client.FtpClient;

public class FtpFileUpload {
	public static void main(String [] args) {

		FtpClient.upload("127.0.0.1" //host address
				, 10001 //port
				, "C:\\Users\\moara\\Downloads\\FileZilla_3.32.0_win64-setup.exe" // send file path
				, "/home/moara/FileZilla_3.32.0_win64-setup.exe" //receive save file path
		);
	}
}
```
- src test 패키지 참조

# gradle
implementation 'org.moara.ftp:moara-ftp:0.1.0'

# etc
https://mvnrepository.com/artifact/org.moara.ftp/moara-ftp/0.1.0

