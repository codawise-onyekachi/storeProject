package smallStore;

import java.time.Month;
import java.time.YearMonth;

public class CreditCardInformation {
    private String creditCardNumber;
    private String nameOnCard;
    private byte cardCvv;
    private YearMonth cardExpirationYearMonth;
    private CardType cardType;


    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getNameOnCard() {
        return nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public byte getCardCvv() {
        return cardCvv;
    }

    public void setCardCvv(byte cardCvv) {
        this.cardCvv = cardCvv;
    }

    public YearMonth getCardExpirationYearMonth() {
        return cardExpirationYearMonth;
    }

    public void setCardExpirationYearMonth(YearMonth cardExpirationYearMonth) {
        this.cardExpirationYearMonth = cardExpirationYearMonth;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "CreditCardInformation{" +
                "creditCardNumber='" + creditCardNumber + '\'' +
                ", nameOnCard='" + nameOnCard + '\'' +
                ", cardCvv=" + cardCvv +
                ", cardExpirationYearMonth=" + cardExpirationYearMonth +
                ", cardType=" + cardType +
                '}';
    }
}