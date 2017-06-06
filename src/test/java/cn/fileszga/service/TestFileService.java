package cn.fileszga.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URLEncoder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:junit-test.xml" })
public class TestFileService {

    @Autowired
    @Qualifier("fileszgaService")
    private IFileService fileszgaService;
    

	@Test
	public void testInsertWechatInfo() {
//		System.out.println(fileszgaService.getUpToken());
//		System.out.println(fileszgaService.getQiniuImgDomain());
//		System.out.println(new QiniuUpload().getQiniuImgDomain());
		
		
	}
	
	
	@Test
	public void uploadfileszga() {
		InputStream fis = null; 
		try {
//			fileszgaService.uploadfileszga("/Users/Jeff.yang/Downloads/图片/百香翡翠茶.jpg",0);
			String fileszgaName = "201704241906149303196217551401.jpg";
			String domainOfBucket = "http://oojgfm8c9.bkt.clouddn.com/";
			String encodedfileszgaName = URLEncoder.encode(fileszgaName, "utf-8");
			String finalUrl = String.format("%s/%s", domainOfBucket, encodedfileszgaName);
			System.out.println(finalUrl);
			
            File fileszga = new File(finalUrl);  // path是指欲下载的文件的路径。  
            // 取得文件名。  
            String fileszganame = fileszga.getName();  
            // 以流的形式下载文件。  
            fis = new BufferedInputStream(new FileInputStream(finalUrl));  
            System.out.println("文件流："+fis);
			
//			URL imgUrl = new URL(finalUrl);
//			HttpURLConnection httpURLConnection = (HttpURLConnection) imgUrl.openConnection();
//            httpURLConnection.setRequestMethod("POST");
//            httpURLConnection.setConnectTimeout(5 * 1000);
//            System.out.println(httpURLConnection.getInputStream());
            
           
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void getUpToken() {
//		System.out.println(fileszgaService.getUpToken());
//		System.out.println(fileszgaService.getUpToken());
		
	}
	
	
    

}
