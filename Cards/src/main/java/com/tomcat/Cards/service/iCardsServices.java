package com.tomcat.Cards.service;

import com.tomcat.Cards.dto.CardsDto;
import com.tomcat.Cards.model.Cards;

import javax.smartcardio.CardNotPresentException;
import java.util.List;

public interface iCardsServices {
    boolean createNewCard(String mobileNumber) throws CardNotPresentException;

    List<Cards> fetchingAllCustomersCards();

    CardsDto fetchCardDetailsByCardNumber(String cardNumber);

    boolean cardDetailsUpdation(CardsDto cardsDto);

    boolean cardClosureHandler(String mobileNumber);

    boolean resetCardLimitToZero(CardsDto cardsDto);
}
