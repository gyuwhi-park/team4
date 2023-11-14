package com.team4.controller;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.team4.domain.BrandVO;
import com.team4.domain.ColorVO;
import com.team4.domain.Div1VO;
import com.team4.domain.Div2VO;
import com.team4.domain.Div3VO;
import com.team4.domain.ImageVO;
import com.team4.domain.ProductVO;
import com.team4.domain.SizeVO;
import com.team4.service.BrandService;
import com.team4.service.ColorService;
import com.team4.service.Div1Service;
import com.team4.service.Div2Service;
import com.team4.service.Div3Service;
import com.team4.service.ImageService;
import com.team4.service.ProductService;
import com.team4.service.SizeService;

@Controller
@RequestMapping("admin/product")
public class AdminProductController {
   @Autowired
   private BrandService brandService;
   @Autowired
   private Div1Service div1Service;
   @Autowired
   private Div2Service div2Service;
   @Autowired
   private Div3Service div3Service;
   @Autowired
   private ProductService productService;
   @Autowired
   private ImageService imageService;
   @Autowired
   private ColorService colorService;
   @Autowired
   private SizeService sizeService;
   
   @RequestMapping("/{step}")
   public String viewPage(@PathVariable String step) {
      System.out.println("load page - admin/product/ : "+step);
      return "admin/product/"+step;
   }
   
   @RequestMapping(value = {"/categoryManage", "/register"})
   public void adminProductCategoryManage(Model m) {
      List<BrandVO> bResult = brandService.getBrandList(null);
      m.addAttribute("brandList", bResult);
      
      List<Div1VO> d1Result = div1Service.getDiv1List(null);
      m.addAttribute("div1List", d1Result);
      
      List<Div2VO> d2Result = div2Service.getDiv2List(null);
      m.addAttribute("div2List", d2Result);
      
      List<Div3VO> d3Result = div3Service.getDiv3List(null);
      m.addAttribute("div3List", d3Result);
      
      List<ProductVO> pResult = productService.getProductList(null);
      m.addAttribute("productList", pResult);
   }
   
   @RequestMapping("/getdiv2")
   @ResponseBody
   public List<Div2VO> adminGetDiv2(Div2VO vo) {
//      System.out.println("AdminProductController >> adminGetDiv2");
      HashMap map = new HashMap();
      map.put("div1_idx", vo.getDiv1_idx());
      System.out.println("AdminProductController >> adminGetDiv2 / map : "+map.toString());
      List<Div2VO> result = div2Service.getDiv2List(map);
      System.out.println("AdminProductController >> adminGetDiv2 / result : "+result);
//      m.addAttribute("div2List", result);
      return result;
   }
   
   @RequestMapping("/getdiv3")
   @ResponseBody
   public List<Div3VO> adminGetDiv3(Div3VO vo) {
      HashMap map = new HashMap();
      map.put("div2_idx", vo.getDiv2_idx());
      System.out.println("AdminProductController >> adminGetDiv3 / vo : "+vo.toString());
      List<Div3VO> result = div3Service.getDiv3List(map);
      System.out.println("AdminProductController >> adminGetDiv3 / result : "+result);
      return result;
   }
   
   @RequestMapping("/addDiv1")
   @ResponseBody
   public Integer addDiv1(Div1VO vo) {
//      System.out.println("--------------------------------------------------------------");
//      System.out.println("AdminProductController >> addDiv1");
      Integer result = div1Service.insertDiv1(vo);
//      System.out.println("AdminProductController >> addDiv1 / result : "+result);
      return result;
   }
   @RequestMapping("/addDiv2")
   @ResponseBody
   public Integer addDiv2(Div2VO vo) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("AdminProductController >> addDiv2 / vo"+vo.toString());
      Integer result = div2Service.insertDiv2(vo);
      System.out.println("AdminProductController >> addDiv2 / result : "+result);
      return result;
   }
   
   @RequestMapping("/addDiv3")
   @ResponseBody
   public Integer addDiv3(Div3VO vo) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("AdminProductController >> addDiv3 / vo"+vo.toString());
      Integer result = div3Service.insertDiv3(vo);
      System.out.println("AdminProductController >> addDiv3 / result : "+result);
      return result;
   }
   
   @RequestMapping("/addBrand")
   @ResponseBody
   public Integer addBrand(BrandVO vo) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("AdminProductController >> addBrand vo : "+vo);
      Integer result = brandService.insertBrand(vo);
      System.out.println("AdminProductController >> addBrand / result : "+result);
      return result;
   }
   
   @RequestMapping("/stockManage")
   public List<ProductVO> getProductList(Model m){
//      System.out.println("AdminProductController >> getProductList");
      List<ProductVO> result = productService.getProductList(null);
//      System.out.println("AdminProductController >> getProductList / result "+ result);
      m.addAttribute("productList", result);
      return result;
   }
   
   @RequestMapping("/productUpdate")
   @ResponseBody
   public String updateStock(ProductVO vo) {
//      System.out.println("--------------------------------------------------------------");
//      System.out.println("AdminProductController >> updateStock");      
      Integer result = productService.updateProduct(vo);
//      System.out.println("AdminProductController >> updateStock / result : "+result);
      if(result == 1) {
         return "Success";
      } else {
         return "Fail";         
      }
   }
   @RequestMapping("/productInsert")
   @ResponseBody
   public String insertStock(ProductVO vo) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("AdminProductController >> insertStock");      
      Integer result = productService.insertProduct(vo);
      System.out.println("AdminProductController >> insertStock / result : "+result);
      if(result == 1) {
         return "Success";
      } else {
         return "Fail";         
      }
   }
   @RequestMapping("/productManage")
   public void productManage(Model m) {
      System.out.println("--------------------------------------------------------------");
      System.out.println("AdminProductController >> productManage");      
      List<ProductVO> result = productService.getProductList(null);
      System.out.println("AdminProductController >> productManage / result : "+result);
      m.addAttribute("productList", result);
   }
   
   @RequestMapping("/imageManage")
   public void productImageManage(ProductVO vo, Model m) {
      HashMap map = new HashMap();
      map.put("product_idx", vo.getProduct_idx());
      System.out.println("AdminProductController >> productImageManage / map : "+map.toString());      
      List<ImageVO> result = imageService.getImageList(map);
      System.out.println("AdminProductController >> productImageManage / result : "+result);
      m.addAttribute("product_idx", vo.getProduct_idx());
      m.addAttribute("product_name", vo.getProduct_name());
      m.addAttribute("productImageList", result);
   }
   
   //https://tyrannocoding.tistory.com/54
   @ResponseBody
   @RequestMapping(value = "/file-upload", method = RequestMethod.POST)
   public String fileUpload(
         @RequestParam("article_file") List<MultipartFile> multipartFile,
         @RequestParam("product_idx") String product_idx,
         HttpServletRequest request) {
      
      String strResult = "{ \"result\":\"FAIL\" }";
//      String contextRoot = new HttpServletRequestWrapper(request).getRealPath("/");
      String fileRoot = "C:\\Users\\ICT03-16\\Documents\\workspace-sts-3.9.14.RELEASE\\shopping\\src\\main\\webapp\\resources\\images\\cloth\\";
      try {
         // 파일이 있을때 탄다.
         if(multipartFile.size() > 0 && !multipartFile.get(0).getOriginalFilename().equals("")) {
            
            for(MultipartFile file:multipartFile) {               
               String originalFileName = file.getOriginalFilename();   //오리지날 파일명            
               File targetFile = new File(fileRoot + originalFileName);   
               try {
                  file.transferTo(targetFile);
                  
                  InputStream fileStream = file.getInputStream();
                  FileUtils.copyInputStreamToFile(fileStream, targetFile); //파일 저장
                  ImageVO ivo = new ImageVO();
                  
                  ivo.setImage_name(originalFileName);
                  ivo.setImage_path(fileRoot);
                  ivo.setProduct_idx(product_idx.substring(1));
                  
                  System.out.println("AdminProductController >> fileUpload");
                  Integer result = imageService.insertImage(ivo);
                  System.out.println("AdminProductController >> fileUpload / result : "+result);
                  
               } catch (Exception e) {
                  //파일삭제
                  FileUtils.deleteQuietly(targetFile);   //저장된 현재 파일 삭제
                  e.printStackTrace();
                  break;
               }
            }
            strResult = "{ \"result\":\"OK\" }";
         }
         // 파일 아무것도 첨부 안했을때 탄다.(게시판일때, 업로드 없이 글을 등록하는경우)
         else
            strResult = "{ \"result\":\"OK\" }";
      }catch(Exception e){
         e.printStackTrace();
      }
      return strResult;
   }
   
   @RequestMapping("/deleteImage")
   @ResponseBody
   public String deleteImage(ImageVO vo) {
      System.out.println("AdminProductController >> deleteImage / vo : "+vo.toString());
      Integer result = imageService.deleteImage(vo);
      System.out.println("AdminProductController >> deleteImage / result : "+result.toString());
      if(result == 1) {
         return "OK";
      } else {
         return "NO";
      }
   }
   
   @RequestMapping("/getColorList")
   @ResponseBody
   public List<ColorVO> adminGetColorList(ProductVO vo) {
      HashMap map = new HashMap();
      map.put("product_idx", vo.getProduct_idx());
      System.out.println("AdminProductController >> adminGetColorList / map : "+map.toString());
      List<ColorVO> result = colorService.getColorList(map);
      System.out.println("AdminProductController >> adminGetColorList / result : "+result);
      return result;
   }

   @RequestMapping("/getSizeList")
   @ResponseBody
   public List<SizeVO> adminGetSizeList(ProductVO vo) {
      HashMap map = new HashMap();
      map.put("product_idx", vo.getProduct_idx());
      System.out.println("AdminProductController >> adminGetDiv3 / vo : "+vo.toString());
      List<SizeVO> result = sizeService.getSizeList(map);
      System.out.println("AdminProductController >> adminGetDiv3 / result : "+result);
      return result;
   }
}