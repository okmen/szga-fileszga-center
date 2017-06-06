package cn.fileszga.service.impl;

import java.io.File;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.qcloud.cos.exception.AbstractCosException;

import cn.fileszga.common.CosUpload;
import cn.fileszga.service.IFileService;

/**
 * @ClassName: IFileServiceImpl
 * @Description: TODO(腾讯云图片处理)
 * @author yangzan
 * @date 2017年6月6日
 */
@Service("fileService")
public class IFileServiceImpl implements IFileService {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * @Title: uploadfileszga @Description: TODO(通过文件路径上传文件) @param @param
	 * localfileszga @param @return @param @throws Exception 设定文件 @return boolean
	 * 返回类型 @throws
	 */
//	@Override
//	public String uploadfileszga(String localfileszga, Integer days) throws Exception {
//		logger.info("【七牛云】上传文件路径:" + localfileszga);
//		File fileszga = new File(localfileszga);
//		return uploadfileszga(fileszga, days);
//	}

	/**
	 * @Title: uploadfileszga @Description: TODO(通过fileszga上传文件) @param @param
	 * fileszga @param @return @param @throws Exception 设定文件 @return boolean
	 * 返回类型 @throws
	 */
//	@Override
//	public String uploadfileszga(File fileszga, Integer days) throws Exception {
//		logger.info("【七牛云】上传文件:" + fileszga + "\t存活天数:" + days);
//		// 生成图片名称
//		String fileszgaName = QiniuUpload.getBigfileszgaName();
//		// 上传图片
//		new QiniuUpload().upload(fileszga.toString(), fileszgaName, days);
//		// 返回图片路径
//		return getQiniuImgDomain() + fileszgaName;
//	}

//	/**
//	 * 获取图片域名
//	 */
//	public String getQiniuImgDomain() {
//		logger.info("七牛云获取图片域名...");
//		String str = QiniuUpload.getQiniuImgDomain();
//		logger.info("七牛云图片域名=" + str);
//		return str;
//	}

//	/**
//	 * 获取上传凭证
//	 */
//	public String getUpToken() {
//		logger.info("七牛云获取上传凭证...");
//		String str = QiniuUpload.getUpToken();
//		logger.info("七牛云获取上传凭证=" + str);
//		return str;
//	}

	@Override
	public String uploadfile(File file) throws Exception {
		logger.info("【腾讯云】上传文件...");
		String url = "";
		
		//根据file生成文件
		
//		
//		// 生成图片名称
//		String fileName = QiniuUpload.getBigFileName();
//		// 上传图片
//		new QiniuUpload().upload(file.toString(), fileName, days);
		// 返回图片路径
		return url;
	}
	
	/**
 	 * @Title: getUploadSign
 	 * @Description: TODO(获取图片上传签名)
 	 * @param @param cosPath
 	 * @param @return    参数
 	 * @return String    返回类型
 	 * @throws
 	 */
	@Override
	public String getUploadSign(String cosPath) {
		logger.info("【腾讯云】获取图片上传签名 path="+cosPath);
		String str = "";
		try {
			str = CosUpload.getPeriodEffectiveSign(cosPath);
		} catch (AbstractCosException e) {
			logger.error("【腾讯云】获取图片上传签名异常,",e);
		}
		logger.info("【腾讯云】获取图片上传签名结果=" + str);
		return str;
	}
	

}