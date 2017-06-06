package cn.fileszga.common;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.qcloud.cos.COSClient;
import com.qcloud.cos.ClientConfig;
import com.qcloud.cos.exception.AbstractCosException;
import com.qcloud.cos.request.UploadFileRequest;
import com.qcloud.cos.sign.Credentials;
import com.qcloud.cos.sign.Sign;

import net.sf.json.JSONObject;

/**
 * @ClassName: CosUpload
 * @Description: TODO(腾讯云对象存储)
 * @author yangzan
 * @date 2017年6月5日
 */
public class CosUpload {
	private final Logger logger = LoggerFactory.getLogger(getClass());
	
    static long appId = 1253555292;
    static String secretId = "AKIDZ4RsBLcDzb1INIFczA8uUAgbLtENH4g7";
    static String secretKey = "OaaO3Zw9f1B8tWxEMKCvRn13treQ8mKg";
    static String bucketName = "szgaimgs";      // 设置要操作的bucket
    
    public static void main(String[] args) {
//    	// 初始化客户端配置
//        ClientConfig clientConfig = new ClientConfig();
//        // 设置bucket所在的区域，比如广州(gz), 天津(tj)
//        clientConfig.setRegion("gz");
//        // 初始化秘钥信息
//        Credentials cred = new Credentials(appId, secretId, secretKey);
//        // 初始化cosClient
//        COSClient cosClient = new COSClient(clientConfig, cred);
//        
//        // 1. 上传文件(默认不覆盖)
//        // 将本地的local_file_1.txt上传到bucket下的根分区下,并命名为sample_file.txt
//        // 默认不覆盖, 如果cos上已有文件, 则返回错误
//        String cosFilePath = "/百香翡翠绿茶222.jpg";
//        String localFilePath1 = "/Users/Jeff.yang/Downloads/图片/百香翡翠绿茶.jpg";
//        UploadFileRequest uploadFileRequest =
//                new UploadFileRequest(bucketName, cosFilePath, localFilePath1);
//        uploadFileRequest.setEnableShaDigest(false);
//        String uploadFileRet = cosClient.uploadFile(uploadFileRequest);
//        System.out.println("upload file ret:" + uploadFileRet);
    	
//    	CosUpload cosUpload = new CosUpload();
//    	try {
//			cosUpload.upload("/Users/Jeff.yang/Downloads/图片/百香翡翠绿茶.jpg", "/测试上传.jpg");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
    	try {
			System.out.println(getPeriodEffectiveSign("/2.jpg"));
		} catch (AbstractCosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
	}
    
    /**
     * @Title: upload
     * @Description: TODO(上传图片)
     * @param @param filePath
     * @param @param key
     * @param @return
     * @param @throws QiniuException    参数
     * @return String    返回类型
     * @throws
     */
    public String upload(String filePath,String key) {
    	logger.info("腾讯云图片上传...图片名称:"+key);
    	String uploadFileRet ="";
    	// 初始化客户端配置
        ClientConfig clientConfig = new ClientConfig();
        // 设置bucket所在的区域，比如广州(gz), 天津(tj)
        clientConfig.setRegion("gz");
        // 初始化秘钥信息
        Credentials cred = new Credentials(appId, secretId, secretKey);
        // 初始化cosClient
        COSClient cosClient = new COSClient(clientConfig, cred);
        try {
            // 1. 上传文件(默认不覆盖)
            // 将本地的local_file_1.txt上传到bucket下的根分区下,并命名为sample_file.txt
            // 默认不覆盖, 如果cos上已有文件, 则返回错误
            String cosFilePath = key; 	//"/百香翡翠绿茶222.jpg"
            String localFilePath1 = filePath;	//图片上传路径
            UploadFileRequest uploadFileRequest =
                    new UploadFileRequest(bucketName, cosFilePath, localFilePath1);
            uploadFileRequest.setEnableShaDigest(false);
            uploadFileRet = cosClient.uploadFile(uploadFileRequest);
            logger.info("腾讯云图片上传结果："+uploadFileRet);
        } catch (Exception e) {
            // 请求失败时打印的异常的信息
            logger.error("腾讯云图片上传错误 File="+filePath,e);
            throw e;
        }finally {
        	//关闭连接
        	cosClient.shutdown();
		}
        return uploadFileRet;
    }
    
    /**
     * @throws AbstractCosException 
     * @Title: getUpToken
     * @Description: TODO(获取上传签名)
     * @param @return    参数
     * @return String    返回类型
     * @throws
     */
    public static String getPeriodEffectiveSign(String cosPath) throws AbstractCosException {
    	Credentials cred = new Credentials(appId, secretId, secretKey);
    	long expired = System.currentTimeMillis() / 1000 + 86400;  //签名有效时间: 1天
    	String signStr = Sign.getPeriodEffectiveSign(bucketName, cosPath, cred, expired);
    	return signStr;
    }
    
}
