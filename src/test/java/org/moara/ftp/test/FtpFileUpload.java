/*
 * Copyright (C) 2020 Wigo Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.moara.ftp.test;


import org.moara.ftp.client.FtpClient;

/**
 * ftp 서버에 파일 올리기
 * @author mimimjin
 */
public class FtpFileUpload {
	public static void main(String [] args) {

		FtpClient.upload("127.0.0.1" //host address
				, 10001 //port
				, "C:\\Users\\moara\\Downloads\\FileZilla_3.32.0_win64-setup.exe" // send file path
				, "/home/moara/FileZilla_3.32.0_win64-setup.exe" //receive save file path
		);
	}
}
