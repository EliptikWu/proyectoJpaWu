package DonacionesWu.domain.controllers;

import DonacionesWu.domain.enums.PaymentType;
import DonacionesWu.domain.enums.TransactionType;
import DonacionesWu.domain.mapping.dto.DonationDto;
import DonacionesWu.domain.service.DonationService;
import DonacionesWu.domain.service.impl.DonationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping
public class DonationController {
    private final DonationService DonationService;

    public DonationController(DonationServiceImpl DonationService) {
        this.DonationService = DonationService;
    }

    @GetMapping("/donation/creation")
    public ModelAndView createDonation() {
        ModelAndView modelAndView = new ModelAndView("DonationForm");
        modelAndView.addObject("donation", DonationService.list());
        return modelAndView;
    }
    @PostMapping("/donation/new")
    public String createNewDonation(@RequestParam("name") String name,
                                    @RequestParam("amount") double amount,
                                    @RequestParam("transaction") String transactionT,
                                    @RequestParam("payment")String payment) {
        DonationDto donationDto = DonationDto.builder()
                .idDonation(0)
                .name(name)
                .amount(amount)
                .date(LocalDate.now())
                .transactionT(TransactionType.valueOf(String.valueOf(transactionT)))
                .payment(PaymentType.valueOf(String.valueOf(payment)))
                .build();
        DonationService.save(donationDto);

        return "redirect:/donation/creation?success";
    }
    @GetMapping("/donation/list")
    public String listDonation(Model model) {
        List<DonationDto> donationList = DonationService.list();
        model.addAttribute("donations", donationList);
        return "donationList";
    }

    @GetMapping("/donation/update")
    public ModelAndView updateDonation(){
        ModelAndView modelAndView = new ModelAndView("UpdateDonation");
        modelAndView.addObject("movies", DonationService.list());
        return modelAndView;
    }
    @PostMapping("/donation/updated")
    public String updateDonation(@RequestParam("id") int id,
                              @RequestParam("name") String name){
        DonationDto donationDto = DonationDto.builder().idDonation(id).name(name).build();
        DonationService.save(donationDto);
        return "redirect:/movie/update?success";
    }


}
