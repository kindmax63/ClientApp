package com.example.diplom.controllers;

import com.example.diplom.entity.Application;
import com.example.diplom.entity.BankAccount;
import com.example.diplom.entity.Client;
import com.example.diplom.entity.Photos;
import com.example.diplom.services.ApplicationService;
import com.example.diplom.services.BankAccountService;
import com.example.diplom.services.ClientService;
import com.example.diplom.services.PhotoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class OrderController {

    private final ClientService clientService;
    private final BankAccountService accountService;
    private final PhotoService photoService;
    private final ApplicationService  applicationService;


    @GetMapping("/order")
    public String applications() {
        return "page-order";
    }

    @PostMapping("/order/create")
    public String createOrder(Client client, Application application, BankAccount bankAccount, Photos photos) {
        clientService.createClient(client);
        accountService.createBankAccount(bankAccount);
        photoService.createPhotos(photos);
        applicationService.createApplication(application);
        return "redirect:/";
    }

}
