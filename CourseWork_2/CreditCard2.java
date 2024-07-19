
/**
 * Write a description of class CreditCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
public class CreditCard2
{
    JFrame frame;
    JPanel panel;
    JLabel cardId,issuebank,bankAccount,balanceAmount,clientName,cvcnumber,interestrate,expirationdate;
    JTextField f_cardId,f_issuebank,f_BankAccount,f_BalanceAmount,f_ClientName,f_cvcnumber,f_interestrate,f_expirationdate;
    JButton add_a_credit_card,cancle,set_credit_limit,cancle_credit_limit,display;
    
    CreditCard2(){
        frame = new JFrame("Add to Credit Card");
        panel = new JPanel();
        frame.add(panel);
        
        cardId = new JLabel("Card Id:");
        cardId.setBounds(40,71,68,25);
        panel.add(cardId);
        f_cardId = new JTextField();
        f_cardId.setBounds(143,71,151,31);
        panel.add(f_cardId);
        
        issuebank = new JLabel("Issue Bank:");
        issuebank.setBounds(11,134,101,25);
        panel.add(issuebank);
        f_issuebank= new JTextField();
        f_issuebank.setBounds(143,134,150,32);
        panel.add(f_issuebank);
        
        bankAccount = new JLabel("Bank Account:");
        bankAccount.setBounds(11,197,126,25);
        panel.add(bankAccount);
        f_BankAccount = new JTextField();
        f_BankAccount.setBounds(143,198,150,32);
        panel.add(f_BankAccount);
        
        bankAccount = new JLabel("Bank Amount:");
        bankAccount.setBounds(11,255,122,25);
        panel.add(bankAccount);
        f_BalanceAmount = new JTextField();
        f_BalanceAmount.setBounds(151,262,150,32);
        panel.add(f_BalanceAmount);
        
        clientName = new JLabel("Client Name:");
        clientName.setBounds(393,71,98,22);
        panel.add(clientName);
        f_ClientName = new JTextField();
        f_ClientName.setBounds(519,71,154,31);
        panel.add(f_ClientName);
        
        cvcnumber = new JLabel("CVC Number:");
        cvcnumber.setBounds(393,138,117,25);
        panel.add(cvcnumber);
        f_cvcnumber = new JTextField();
        f_cvcnumber.setBounds(519,136,154,28);
        panel.add(f_cvcnumber);
         
        interestrate = new JLabel("Intrest Rate:");
        interestrate.setBounds(405,198,105,25);
        panel.add(interestrate);
        f_interestrate = new JTextField();
        f_interestrate.setBounds(520,198,153,32);
        panel.add(f_interestrate);
        
        expirationdate = new JLabel("Expiration Date:");
        expirationdate.setBounds(372,260,130,25);
        panel.add(expirationdate);
        f_expirationdate = new JTextField();
        f_expirationdate.setBounds(520,264,153,31);
        panel.add(f_expirationdate);
        
        add_a_credit_card = new JButton("Add a Credit Card");
        add_a_credit_card.setBounds(180,319,158,47);
        panel.add(add_a_credit_card);
        
        cancle = new JButton("Cancle");
        cancle.setBounds(350,319,158,47);
        panel.add(cancle);
        
        set_credit_limit = new JButton("Set Credit Limit");
        set_credit_limit.setBounds(9,319,158,47);
        panel.add(set_credit_limit);
        
        cancle_credit_limit = new JButton("Cancle credit Limit");
        cancle_credit_limit.setBounds(520,319,158,47);
        panel.add(cancle_credit_limit);
        
        display = new JButton("Dispaly");
        display.setBounds(260,380,158,47);
        panel.add(display);
        
        
        
        panel.setLayout(null);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(750,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
    
    
    
    
    
    
    
    
    
    

