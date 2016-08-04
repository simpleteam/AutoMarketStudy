package com.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.dao.PhotoDao;
import com.entity.Photo;



@Controller
@RequestMapping("/photo")
public class PhotoController {

	@Autowired
	private PhotoDao photoDao;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	public HttpEntity<byte[]> showPhoto(@PathVariable("id") int id, Model model) {
		byte[] image = photoDao.get(id).getPhoto();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.IMAGE_JPEG);
		headers.setContentLength(image.length);
		return new HttpEntity<byte[]>(image, headers);
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String initCreationPhoto(Model model) {
		model.addAttribute("photo", new Photo());
		return "/photo/initCreatePhoto";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processCreationPhoto(Photo photo, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("photo", photo);
			return "/photo/initCreatePhoto";
		}
		photoDao.add(photo);
		return "redirect:/photo/" + photo.getId();
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String uploadFileHandler(@RequestParam("file") MultipartFile file) {

		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				Photo photo = new Photo();
				photo.setPhoto(bytes);
				photoDao.add(photo);
				return "redirect:/photo/" + photo.getId();
			} catch (Exception e) {
				return "/photo/initCreatePhoto";
			}
		} else {
			return "/photo/initCreatePhoto";
		}
	}

}
