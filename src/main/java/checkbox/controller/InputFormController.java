package checkbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import checkbox.model.InputFormModel;
import checkbox.model.Option;

@Controller
public class InputFormController { // inputForm1
	@RequestMapping(value = "inputForm1", method = RequestMethod.GET)
	public String inputForm1(Model model) {
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] { "red", "blue" });
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		return "inputForm1";
	}

	@RequestMapping(value = "inputForm1", method = RequestMethod.POST)
	public String inputForm1(Model model, InputFormModel inputFormModle) {
		return "inputForm1";
	} // inputForm2

	String[] colors = new String[] { "red", "yellow", "blue" };

	@RequestMapping(value = "inputForm2", method = RequestMethod.GET)
	public String inputForm2(Model model) {
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] { "red", "blue" });
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		model.addAttribute("colors", colors);
		return "inputForm2";
	}

	@RequestMapping(value = "inputForm2", method = RequestMethod.POST)
	public String inputForm2(Model model, InputFormModel inputFormModle) {
		model.addAttribute("colors", colors);
		return "inputForm2";
	} // inputForm3

	Option[] options = new Option[] { new Option("red", "빨강"), new Option("yellow", "노랑"), new Option("blue", "파랑") };

	@RequestMapping(value = "inputForm3", method = RequestMethod.GET)
	public String inputForm3(Model model) {
		InputFormModel inputFormModel = new InputFormModel();
		inputFormModel.setColor1("yellow");
		inputFormModel.setColor2(new String[] { "red", "blue" });
		inputFormModel.setColor3("blue");
		model.addAttribute("inputFormModel", inputFormModel);
		model.addAttribute("options", options);
		return "inputForm3";
	}

	@RequestMapping(value = "inputForm3", method = RequestMethod.POST)
	public String inputForm3(Model model, InputFormModel inputFormModle) {
		model.addAttribute("options", options);
		return "inputForm3";
	}
}
