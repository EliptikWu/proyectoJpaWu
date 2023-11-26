package DonacionesWu.domain.controllers;

import DonacionesWu.domain.entities.Donation;
import DonacionesWu.domain.enums.PaymentType;
import DonacionesWu.domain.service.DonationService;
import DonacionesWu.domain.service.TransactionService;
import DonacionesWu.domain.service.impl.DonationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@RequestMapping
public class DonationController {
    private final DonationService DonationService;
    private final TransactionService TransactionService;

    public DonationController(DonationServiceImpl DonationService, TransactionService TransactionService) {
        this.DonationService = DonationService;
        this.TransactionService = TransactionService;
    }

    @GetMapping("donation/creation")
    public ModelAndView createDonation() {
        ModelAndView modelAndView = new ModelAndView("DonationForm");
        modelAndView.addObject("donation", DonationService.list());
        return modelAndView;
    }
    @PostMapping("donation/new")
    public String createNewDonation(@RequestParam("name") String name,
                                    @RequestParam("amount") double amount,
                                    @RequestParam("transaction") int idTransaction,
                                    @RequestParam("paymtentType")PaymentType payment) {
        Donation donation = Donation.builder()
                .name(name)
                .amount(amount)
                .date(LocalDate.now())
                .payment(PaymentType.valueOf(String.valueOf(payment)))
                .transaction(TransactionService.byId(idTransaction))
                .build();
        DonationService.save(donation);

        return "redirect:/donation/create?success";
    }
}
