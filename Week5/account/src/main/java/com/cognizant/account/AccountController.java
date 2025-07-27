package com.cognizant2.account.loan;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {
        return Map.of(
                "number", number,
                "type", "savings",
                "balance", 234343
        );
    }
}
