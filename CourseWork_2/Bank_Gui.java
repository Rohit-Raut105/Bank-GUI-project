
/**
 * Write a description of class Bank_Gui here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Bank_Gui implements ActionListener
{
    //Declearing the Variables of main gui,
    JFrame frame_1;
    JPanel   panel_1;
    JButton bankcard_gui,creditcard_gui;
    JLabel title;

    //Decleraing the variable for Credit card,
    JFrame frame_2;
    JPanel panel_2;
    JLabel cardId,issuebank,bankAccount,balanceAmount,clientName,cvcnumber,interestrate,expirationdate;
    JTextField f_cardId,f_issuebank,f_BankAccount,f_BalanceAmount,f_ClientName,f_cvcnumber,f_interestrate,f_expirationdate;
    JButton add_a_credit_card,cancle,set_credit_limit,cancle_credit_limit,display_2,home_2,go_back_to_credit;

    //Declearing the variables for Debit Card.
    JFrame frame_3;
    JPanel panel_3;
    JLabel  tital,pinnumber,withdrawamount,dateofwithdraw,clientname,balanceamount,cardid,bankaccount,issuerbank;
    JTextField f_pinnumber,f_withdrawamount,f_clientname,f_balanceamount,f_cardid,f_bankaccount,f_issuerbank;
    JButton withdraw_from_debitcard,cancel,display_3,back_2,go_back_to_Creditcard;
    JComboBox f_day,f_months,f_years;

    ArrayList<BankCard> arrayBankcard = new ArrayList<BankCard>();

    public Bank_Gui(){
        frame_1 = new JFrame("Bank GUI");
        panel_1 = new JPanel();
        frame_1.add(panel_1);
        panel_1.setBackground(new Color(249, 231, 159));

        title = new JLabel("Select the approprate Button to continue");
        title.setBounds(145,20,550,42);
        title.setFont(new Font("Italic",Font.PLAIN,30));
        panel_1.add(title);

        bankcard_gui = new JButton("CreditCard GUI");
        panel_1.add(bankcard_gui);
        bankcard_gui.setBounds(50,249,257,61);
        bankcard_gui.setFont(new Font("Arial",Font.PLAIN,30));
        bankcard_gui.setBackground(new Color(232, 218, 239));

        bankcard_gui.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent clicked_goBack_Button){
                    credit_card();
                    frame_1.dispose();
                }
            });

        creditcard_gui = new JButton("Debit Card");
        creditcard_gui.setBounds(429,249,257,61);
        panel_1.add(creditcard_gui);
        creditcard_gui.setBackground(new Color(232, 218, 239));
        creditcard_gui.setFont(new Font("Italic",Font.PLAIN,30));

        creditcard_gui.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent clicked_goBack_Button){
                    Debit_card();
                    frame_1.dispose();
                }
            });

        panel_1.setLayout(null);
        frame_1.add(panel_1);
        frame_1.setResizable(false);
        frame_1.setVisible(true);
        frame_1.setSize(800,600);
        frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args)
    {
        new Bank_Gui();
    }

    public void  credit_card(){
        frame_2 = new JFrame("Add to Credit Card");
        panel_2 = new JPanel();
        frame_2.add(panel_2);
        panel_2.setBackground(new Color(210, 180, 222));

        clientName = new JLabel("Client Name:");
        clientName.setBounds(42,83,160,35);
        panel_2.add(clientName);
        f_ClientName = new JTextField();
        f_ClientName.setBounds(261,88,180,32);
        panel_2.add(f_ClientName);

        issuebank = new JLabel("Issue Bank:");
        issuebank.setBounds(42,155,157,35);
        panel_2.add(issuebank);
        f_issuebank= new JTextField();
        f_issuebank.setBounds(261,155,180,32);
        panel_2.add(f_issuebank);

        balanceAmount = new JLabel("Balance Amount:");
        balanceAmount.setBounds(42,222,219,35);
        panel_2.add(balanceAmount);
        f_BalanceAmount = new JTextField();
        f_BalanceAmount.setBounds(261,227,180,32);
        panel_2.add(f_BalanceAmount);

        interestrate = new JLabel("Intrest Rate:");
        interestrate.setBounds(42,289,167,38);
        panel_2.add(interestrate);
        f_interestrate = new JTextField();
        f_interestrate.setBounds(261,284,180,32);
        panel_2.add(f_interestrate);

        cardId = new JLabel("Card Id:");
        cardId.setBounds(568,83,101,35);
        panel_2.add(cardId);
        f_cardId = new JTextField();
        f_cardId.setBounds(768,83,180,32);
        panel_2.add(f_cardId);

        bankAccount = new JLabel("Bank Account:");
        bankAccount.setBounds(568,151,182,35);
        panel_2.add(bankAccount);
        f_BankAccount = new JTextField();
        f_BankAccount.setBounds(768,151,180,32);
        panel_2.add(f_BankAccount);

        cvcnumber = new JLabel("CVC Number:");
        cvcnumber.setBounds(562,222,168,35);
        panel_2.add(cvcnumber);
        f_cvcnumber = new JTextField();
        f_cvcnumber.setBounds(768,222,180,32);
        panel_2.add(f_cvcnumber);

        expirationdate = new JLabel("Expiration Date:");
        expirationdate.setBounds(562,293,206,35);
        panel_2.add(expirationdate);
        f_expirationdate = new JTextField();
        f_expirationdate.setBounds(768,293,180,32);
        panel_2.add(f_expirationdate);

        add_a_credit_card = new JButton("Add ToCredit Card");
        add_a_credit_card.setBounds(373,350,253,45);
        panel_2.add(add_a_credit_card);
        add_a_credit_card.setBackground(new Color(245, 183, 177));
        add_a_credit_card.setFont(new Font("Italic",Font.PLAIN,25));
        add_a_credit_card.getActionListeners(this);

        set_credit_limit = new JButton("Set Credit Limit");
        set_credit_limit.setBounds(42,434,220,32);
        panel_2.add(set_credit_limit);
        set_credit_limit.setFont(new Font("Italic",Font.PLAIN,25));
        add_a_credit_card.setBackground(new Color(245, 183, 177));
        set_credit_limit.setBackground(new Color(245, 183, 177));
        set_credit_limit.setFont(new Font("Italic",Font.PLAIN,25));

        cancle_credit_limit = new JButton("Cancle credit Limit");
        cancle_credit_limit.setBounds(42,498,261,32);
        panel_2.add(cancle_credit_limit);
        cancle_credit_limit.setFont(new Font("Italic",Font.PLAIN,25));
        cancle_credit_limit.setBackground(new Color(245, 183, 177));
        cancle_credit_limit.setBackground(new Color(245, 183, 177));
        cancle_credit_limit.setFont(new Font("Italic",Font.PLAIN,25));

        go_back_to_credit = new JButton("Go Back To Debit Card");
        go_back_to_credit.setBounds(494,494,305,32);
        panel_2.add(go_back_to_credit);
        go_back_to_credit.setBackground(new Color(245, 183, 177));
        go_back_to_credit.setFont(new Font("Italic",Font.PLAIN,25));
        go_back_to_credit.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent click_goBack_Button){
                    Debit_card();
                    frame_2.dispose();

                }
            });

        public void actionPerformed(ActionEvent a){
        if (a.getSource() == cancle){
            f_ClientName.setText("");
            f_issuebank.setText("");
            f_BalanceAmount.setText("");
            f_interestrate.setText("");
            f_cardId.setText("");
            f_BankAccount.setText("");
            f_cvcnumber.setText("");
            f_expirationdate.setText("");
        }else if(a.getSource == add_a_credit_card)
        {
            String clientname = f_ClientName.getText();
            String issuebank = f_issuebank.getText();
            int bakanceamount = Integer.parseInt(f_BalanceAmount.getText());
            int intrestrate = Intrger.parseInt(f_interestrate.getText());
            int cardid = Integer.parseInt(f_cardId.getText());
            int bankaccount = Integer.parseInt(f_BankAccount.getText());
            String cvcnumber = f_cvcnumber.getText();
            int expiratondate = Integer.parseInt(f_expirationdate.getText());

        }
    }

    display_2   = new JButton("Dispaly");
    display_2.setBounds(678,429,120,32);
    panel_2.add(display_2);
    display_2.setBackground(new Color(245, 183, 177));
    display_2.setFont(new 
    Font("Italic",Font.PLAIN,25));

    home_2 = new JButton("Home");
    home_2.setBounds(846,429,120,32);
    panel_2.add(home_2);
    home_2.setBackground(new Color(245, 183, 177));
    home_2.setFont(new 
    Font("Italic",Font.PLAIN,25));
    home_2.addActionListener(new 
    ActionListener()
    {
        public void actionPerformed(ActionEvent clicked_goBack_Button){
        new Bank_Gui();
        frame_2.dispose();
    }})

cancle = new JButton("Cancle");
cancle.setBounds(845,488,120,32);
panel_2.add(cancle);
cancle.setBackground(new Color(245, 183, 177));
cancle.setFont(new Font("Italic",Font.PLAIN,25));h
cancle.getActionListeners(this);

panel_2.setLayout(null);//#yo panal ja add garako xa tesko pachadi hunu parcah .
frame_2.add(panel_2);
frame_2.setResizable(false);
frame_2.setVisible(true);
frame_2.setSize(1000,600);
frame_2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void Debit_card()
{
frame_3 = new JFrame("DebitCard");
panel_3 = new JPanel();
frame_3.add(panel_3);
panel_3.setBackground(new Color(210, 180, 222));

tital = new JLabel("Debit Card");
tital.setBounds(451,8,152,42);
frame_3.add(tital);

clientname = new JLabel("Client Name:");
clientname.setBounds(29,105,160,35);
panel_3.add(clientname);
f_clientname = new JTextField();
f_clientname.setBounds(260,105,219,41);
panel_3.add(f_clientname);

issuerbank = new JLabel("Issuer Bank:");
issuerbank.setBounds(29,189,157,31);
panel_3.add(issuerbank);
f_issuerbank = new JTextField();
f_issuerbank.setBounds(260,188,219,41);
panel_3.add(f_issuerbank);

pinnumber = new JLabel("Pin Number:");
pinnumber.setBounds(29,265,156,35);
panel_3.add(pinnumber);
f_pinnumber = new JTextField();
f_pinnumber.setBounds(260,271,219,41);
panel_3.add(f_pinnumber);

bankaccount = new JLabel("Bank Account:");
bankaccount.setBounds(29,345,182,35);
panel_3.add(bankaccount);
f_bankaccount = new JTextField();
f_bankaccount.setBounds(260,354,219,41);
panel_3.add(f_bankaccount);

balanceamount = new JLabel("Balance Amount:");
balanceamount.setBounds(29,425,212,35);
panel_3.add(balanceamount);
f_balanceamount = new JTextField();
f_balanceamount.setBounds(260,437,219,41);
panel_3.add(f_balanceamount);

dateofwithdraw = new JLabel("Date Of Withdraw :");
dateofwithdraw.setBounds(500,96,223,35);
panel_3.add(dateofwithdraw);
String day[] = {"1","2","3"};
f_day= new JComboBox(day);
f_day.setBounds(744,105,72,32);
f_day.setBackground(new Color(142, 68, 173));
panel_3.add(f_day); 

String months[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
f_months = new JComboBox(months);
f_months.setBounds(823,105,74,32);
panel_3.add(f_months);
f_months.setBackground(new Color(142, 68, 173));

String yrs[]= {"2020","2021","2023"};
f_years = new JComboBox(yrs);
f_years.setBounds(904,105,84,32);
panel_3.add(f_years);
f_years.setBackground(new Color(142, 68, 173));

withdrawamount = new JLabel("Withdraw Amount :");
withdrawamount.setBounds(500,188,228,35);
panel_3.add(withdrawamount);
f_withdrawamount = new JTextField();
f_withdrawamount.setBounds(751,188,219,41);
panel_3.add(f_withdrawamount);

cardid = new JLabel("Card Id :");
cardid.setBounds(502,280,101,35);
panel_3.add(cardid);
f_cardid = new JTextField();
f_cardid.setBounds(751,271,219,41);
panel_3.add(f_cardid);

display_3= new JButton("Display");
display_3.setBounds(507,357,195,43);
panel_3.add(display_3);
display_3.setBackground(new Color(245, 183, 177));
display_3.setFont(new Font("Italic",Font.PLAIN,25));

cancel = new JButton("Cancel");
cancel.setBounds(739,357,195,43);
panel_3.add(cancel);
cancel.setBackground(new Color(245, 183, 177));
cancel.setFont(new Font("Italic",Font.PLAIN,25));

withdraw_from_debitcard = new JButton("Withdraw from DebitCard");
withdraw_from_debitcard.setBounds(563,425,329,48);
panel_3.add(withdraw_from_debitcard);
withdraw_from_debitcard.setBackground(new Color(245, 183, 177));
withdraw_from_debitcard.setFont(new Font("Italic",Font.PLAIN,25));

add_a_credit_card = new JButton("Add to Debit Card");
add_a_credit_card.setBounds(112,498,257,43);
panel_3.add(add_a_credit_card);
add_a_credit_card.setBackground(new Color(245, 183, 177));
add_a_credit_card.setFont(new Font("Italic",Font.PLAIN,25));

go_back_to_credit= new JButton("Go To CreditCard");
go_back_to_credit.setBounds(739,493,241,43);
panel_3.add(go_back_to_credit);
go_back_to_credit.setBackground(new Color(245, 183, 177));
go_back_to_credit.setFont(new Font("Italic",Font.PLAIN,25));

go_back_to_credit.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent f){
credit_card();
frame_3.dispose();
}
});

back_2 = new JButton("Home");
back_2.setBounds(507,498,195,43);
panel_3.add(back_2);
back_2.setBackground(new Color(245, 183, 177));
back_2.setFont(new Font("Italic",Font.PLAIN,25));

back_2.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e){
new Bank_Gui();
frame_3.dispose();

}
});

panel_3.setLayout(null);
frame_3.add(panel_3);
frame_3.setResizable(false);
frame_3.setVisible(true);
frame_3.setSize(1000,600);
frame_3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
