package cn.fileszga.cos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.request.UploadFileRequest;

public class test {
	 public static void main( String[] args )
	    {
	            // 创建 COSClient实例
	            String bucketName = "szgaimgs";
	            int appId = 1253555292;
                String secretId = "AKIDZ4RsBLcDzb1INIFczA8uUAgbLtENH4g7";
                String secretKey = "OaaO3Zw9f1B8tWxEMKCvRn13treQ8mKg";
                COSClient cosClient = new COSClient(appId, secretId, secretKey);
                
                // 要访问的URL
                String path = "/Users/Jeff.yang/Downloads/图片/百香翡翠绿茶.jpg";
                // 获取文件后缀
                String suffix = path.substring(path.lastIndexOf('.')+1);
                long currentTimeMillis = System.currentTimeMillis();
                // 已时间戳的形式命名, 保证文件不重复
                String localPath = "/Users/Jeff.yang/Downloads/图片/"+currentTimeMillis+"."+suffix;
                // 存储到COS 的路径
                String cosPath = "/haha.png";
                // 将文件存储到本地
                try {
                        URL url = new URL(path);
                        URLConnection urlConnection = url.openConnection();
                        InputStream inputStream = urlConnection.getInputStream();
                        File outfileszga = new File(localPath);
                        OutputStream outputStream = new FileOutputStream(outfileszga);
                        byte[] buf = new byte[1024];
                        while (true) {
                int read = 0;
                if (inputStream != null) {
                    read = inputStream.read(buf);
                }
                if (read == -1) {
                    break;
                }
                outputStream.write(buf, 0, read);
            }
                        outputStream.flush();
                        outputStream.close();
                        inputStream.close();
                        // 文件上传到腾讯COS
                        UploadFileRequest uploadfileszgaRequest = new UploadFileRequest(bucketName, cosPath, localPath);
                        cosClient.uploadFile(uploadfileszgaRequest);
                        // 判断本地文件是否存在, 如果存在则删除
                        if(outfileszga.exists()){
                                outfileszga.delete();
                        }
                } catch (FileNotFoundException e) {
                        e.printStackTrace();
                } catch (IOException e) {
                        e.printStackTrace();
                }
                // 关闭COS连接
                cosClient.shutdown();
	    }
}
