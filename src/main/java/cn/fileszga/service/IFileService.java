 package cn.fileszga.service;
 
import java.io.File;
 
/**
 * @ClassName: IFileService
 * @Description: TODO(深圳公安文件处理接口)
 * @author yangzan
 * @date 2017年6月6日
 */
 public interface IFileService {
	
 	/**
	 * @Title: uploadfile 
	 * @Description: TODO(通过file上传文件) 
	 * @param @param fileszga
	 * @param @return
	 * @param @throws Exception 设定文件 
	 * @return boolean 返回类型 
	 * @throws
 	 */
	public String uploadfile(File file) throws Exception;
 	
 	/**
 	 * @Title: getUploadSign
 	 * @Description: TODO(获取图片上传签名)
 	 * @param @param cosPath
 	 * @param @return    参数
 	 * @return String    返回类型
 	 * @throws
 	 */
    public String getUploadSign(String cosPath);
    
  
 }
