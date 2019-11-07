package ed0wn.bankproject.controllers;

import ed0wn.bankproject.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankApplicationController {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public BankApplicationController() {
    bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, false));
    bankAccounts.add(new BankAccount("Nala", 1000, "lion", false, false));
    bankAccounts.add(new BankAccount("Mufasa", 20000, "lion", true, false));
    bankAccounts.add(new BankAccount("Timon", 50, "meerkat", false, false));
    bankAccounts.add(new BankAccount("Pumba", 2, "warthog"));
    bankAccounts.add(new BankAccount("Zordon", 50, "meerkat", true, true));
  }

  @GetMapping("/show")
  public String showBankAccounts(Model model) {
    model.addAttribute("account", bankAccounts);
    return "index";
  }

  @GetMapping({"/", ""})
  public String home(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>"
    );
    return "home";
  }
}
  //  @GetMapping("/add")
//  public String raise(@ModelAttribute(name = "balance") BankAccount account) {
//    return "index";
//  }
//  @PostMapping("/add/{id}")
//  public String raiseBy( Integer id, Model model, @ModelAttribute(name = "id") BankAccount account) {
//    if (bankAccounts.get(id).isKing()) {
//
//      model.addAttribute("raise", bankAccounts.stream().filter(bankAccount -> bankAccount.setBalance(bankAccount.getBalance() + 100)).collect(Collectors.toList()))
//    } else if (!bankAccounts.get(id).isKing()) {
//      bankAccounts.get(id).setBalance(bankAccounts.get(id).getBalance() + 10);
//    }
//    return "index";
//  }
//}

