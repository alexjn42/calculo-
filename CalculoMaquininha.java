package com.primeirotrampo.crud.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/calculo")
public class CalculoMaquininha {

    @GetMapping("/maquininha")

    public List <Integer> getSomarMaquininha(@RequestParam("valorEntradaM1")Integer valorEntradaM1,
                                             @RequestParam("fichaEntradaM1")Integer segundoValorEntradaM1,
                                             @RequestParam("valorSaidaM1")Integer valorSaidaM1,
                                             @RequestParam("fichaSaidaM1")Integer segundoValorSaidaM1,
                                             @RequestParam("valorEntradaM2")Integer valorEntradaM2,
                                             @RequestParam("fichaEntradaM2")Integer segundoValorEntradaM2,
                                             @RequestParam("valorSaidaM2")Integer valorSaidaM2,
                                             @RequestParam("fichaSaidaM2")Integer segundoValorSaidaM2,
                                             @RequestParam("valorEntradaM3")Integer valorEntradaM3,
                                             @RequestParam("fichaEntradaM3")Integer segundoValorEntradaM3,
                                             @RequestParam("valorSaidaM3")Integer valorSaidaM3,
                                             @RequestParam("fichaSaidaM3")Integer segundoValorSaidaM3,
                                             @RequestParam("valorEntradaM4")Integer valorEntradaM4,
                                             @RequestParam("fichaEntradaM4")Integer segundoValorEntradaM4,
                                             @RequestParam("valorSaidaM4")Integer valorSaidaM4,
                                             @RequestParam("fichaSaidaM4")Integer segundoValorSaidaM4,
                                             @RequestParam("valorEntradaM5")Integer valorEntradaM5,
                                             @RequestParam("fichaEntradaM5")Integer segundoValorEntradaM5,
                                             @RequestParam("valorSaidaM5")Integer valorSaidaM5,
                                             @RequestParam("fichaSaidaM5")Integer segundoValorSaidaM5,
                                             @RequestParam("valorEntradaM6")Integer valorEntradaM6,
                                             @RequestParam("fichaEntradaM6")Integer segundoValorEntradaM6,
                                             @RequestParam("valorSaidaM6")Integer valorSaidaM6,
                                             @RequestParam("fichaSaidaM6")Integer segundoValorSaidaM6,
                                             @RequestParam("valorEntradaM7")Integer valorEntradaM7,
                                             @RequestParam("fichaEntradaM7")Integer segundoValorEntradaM7,
                                             @RequestParam("valorSaidaM7")Integer valorSaidaM7,
                                             @RequestParam("fichaSaidaM7")Integer segundoValorSaidaM7,
                                             @RequestParam("valorEntradaM8")Integer valorEntradaM8,
                                             @RequestParam("fichaEntradaM8")Integer segundoValorEntradaM8,
                                             @RequestParam("valorSaidaM8")Integer valorSaidaM8,
                                             @RequestParam("fichaSaidaM8")Integer segundoValorSaidaM8,
                                             @RequestParam("valorEntradaM9")Integer valorEntradaM9,
                                             @RequestParam("fichaEntradaM9")Integer segundoValorEntradaM9,
                                             @RequestParam("valorSaidaM9")Integer valorSaidaM9,
                                             @RequestParam("fichaSaidaM9")Integer segundoValorSaidaM9,
                                             @RequestParam("valorEntradaM10")Integer valorEntradaM10,
                                             @RequestParam("fichaEntradaM10")Integer segundoValorEntradaM10,
                                             @RequestParam("valorSaidaM10")Integer valorSaidaM10,
                                             @RequestParam("fichaSaidaM10")Integer segundoValorSaidaM10,
                                             @RequestParam("valorEntradaM11")Integer valorEntradaM11,
                                             @RequestParam("fichaEntradaM11")Integer segundoValorEntradaM11,
                                             @RequestParam("valorSaidaM11")Integer valorSaidaM11,
                                             @RequestParam("fichaSaidaM11")Integer segundoValorSaidaM11,
                                             @RequestParam("valorEntradaM12")Integer valorEntradaM12,
                                             @RequestParam("fichaEntradaM12")Integer segundoValorEntradaM12,
                                             @RequestParam("valorSaidaM12")Integer valorSaidaM12,
                                             @RequestParam("fichaSaidaM12")Integer segundoValorSaidaM12)
            {

        Integer totalM1 = (valorEntradaM1 - segundoValorEntradaM1) - (valorSaidaM1 - segundoValorSaidaM1);
        Integer totalM2 = (valorEntradaM2 - segundoValorEntradaM2) - (valorSaidaM2 - segundoValorSaidaM2);
        Integer totalM3 = (valorEntradaM3 - segundoValorEntradaM3) - (valorSaidaM3 - segundoValorSaidaM3);
        Integer totalM4 = (valorEntradaM4 - segundoValorEntradaM4) - (valorSaidaM4 - segundoValorSaidaM4);
        Integer totalM5 = (valorEntradaM5 - segundoValorEntradaM5) - (valorSaidaM5 - segundoValorSaidaM5);
        Integer totalM6 = (valorEntradaM6 - segundoValorEntradaM6) - (valorSaidaM6 - segundoValorSaidaM6);
        Integer totalM7 = (valorEntradaM7 - segundoValorEntradaM7) - (valorSaidaM7 - segundoValorSaidaM7);
        Integer totalM8 = (valorEntradaM8 - segundoValorEntradaM8) - (valorSaidaM8 - segundoValorSaidaM8);
        Integer totalM9 = (valorEntradaM9 - segundoValorEntradaM9) - (valorSaidaM9 - segundoValorSaidaM9);
        Integer totalM10 = (valorEntradaM10 - segundoValorEntradaM10) -(valorSaidaM10 - segundoValorSaidaM10);
        Integer totalM11 = (valorEntradaM11 - segundoValorEntradaM11) - (valorSaidaM11 - segundoValorSaidaM11);
        Integer totalM12 = (valorEntradaM12 - segundoValorEntradaM12) - (valorSaidaM12 - segundoValorSaidaM12);

        Integer valorTotalDaSoma = totalM1+ totalM2+ totalM3 + totalM4 + totalM5 + totalM6 + totalM7 + totalM8 + totalM9 + totalM10 + totalM11 + totalM12;

        List<Integer>  numeroList = new ArrayList<>();

        Integer totalDeEntrada =
                (valorEntradaM1 - segundoValorEntradaM1) +
                (valorEntradaM2 - segundoValorEntradaM2) +
                (valorEntradaM3 - segundoValorEntradaM3) +
                (valorEntradaM4 - segundoValorEntradaM4) +
                (valorEntradaM5 - segundoValorEntradaM5) +
                (valorEntradaM6 - segundoValorEntradaM6) +
                (valorEntradaM7 - segundoValorEntradaM7) +
                (valorEntradaM8 - segundoValorEntradaM8) +
                (valorEntradaM9 - segundoValorEntradaM9) +
                (valorEntradaM10 - segundoValorEntradaM10)+
                (valorEntradaM11 - segundoValorEntradaM11)+
                (valorEntradaM12 - segundoValorEntradaM12);

        Integer totalDeSaida =
                
                        (valorSaidaM1 - segundoValorSaidaM1) +
                        (valorSaidaM2 - segundoValorSaidaM2) +
                        (valorSaidaM3 - segundoValorSaidaM3) +
                        (valorSaidaM4 - segundoValorSaidaM4) +
                        (valorSaidaM5 - segundoValorSaidaM5) +
                        (valorSaidaM6 - segundoValorSaidaM6) +
                        (valorSaidaM7 - segundoValorSaidaM7) +
                        (valorSaidaM8 - segundoValorSaidaM8) +
                        (valorSaidaM9 - segundoValorSaidaM9) +
                        (valorSaidaM10 - segundoValorSaidaM10)+
                        (valorSaidaM11 - segundoValorSaidaM11)+
                        (valorSaidaM12 - segundoValorSaidaM12);

        numeroList.add(totalM1);
        numeroList.add(totalM2);
        numeroList.add(totalM3);
        numeroList.add(totalM4);
        numeroList.add(totalM5);
        numeroList.add(totalM6);
        numeroList.add(totalM7);
        numeroList.add(totalM8);
        numeroList.add(totalM9);
        numeroList.add(totalM10);
        numeroList.add(totalM11);
        numeroList.add(totalM12);
        numeroList.add(totalDeEntrada);
        numeroList.add(totalDeSaida);
        numeroList.add(valorTotalDaSoma);
           
        return numeroList;
    }
     }


