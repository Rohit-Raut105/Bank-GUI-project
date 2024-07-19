
/**
 * Write a description of class BankCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;


public class BankCard1
{
    JFrame frame;
    JPanel panel;
    JLabel cardId,issuebank,bankAccount,balanceAmount,clientName,bankCard,pinnumber;
    JTextField f_CardId,f_Issuebank,f_BankAccount,f_BalanceAmount,f_ClientName,f_pinnumber;
    JButton Summit,Cancle,add_to_Bankcard,display;
    
    public BankCard1(){
        frame = new JFrame("BankCard");
        panel = new JPanel();
        frame.add(panel);
        
        bankCard= new JLabel("BankCard");
        bankCard.setBounds(288,10,123,25);
        frame.add(bankCard);
        
        clientName= new JLabel("Client Name:");
        clientName.setBounds(29,105,144,25);
        panel.add(clientName);
        f_ClientName= new JTextField();
        f_ClientName.setBounds(151,105,174,33);
        panel.add(f_ClientName);
        
        issuebank = new JLabel("Issue Bank:");
        issuebank.setBounds(29,184,101,25);
        panel.add(issuebank);
        f_Issuebank= new JTextField();
        f_Issuebank.setBounds(151,184,180,32);
        panel.add(f_Issuebank);
        
        balanceAmount= new JLabel("Balance Amount:");
        balanceAmount.setBounds(31,255,152,25);
        panel.add(balanceAmount);
        f_BalanceAmount= new JTextField();
        f_BalanceAmount.setBounds(151,262,180,32);
        panel.add(f_BalanceAmount);
        
        bankAccount = new JLabel("Bank Account:");
        bankAccount.setBounds(380,105,126,25);
        panel.add(bankAccount);
        f_BankAccount = new JTextField();
        f_BankAccount.setBounds(510,105,180,32);
        panel.add(f_BankAccount);
        
        cardId = new JLabel("Card Id:");
        cardId.setBounds(421,189,70,25);
        panel.add(cardId);
        f_CardId= new JTextField();
        f_CardId.setBounds(510,198,180,32);
        panel.add(f_CardId);
        
        pinnumber= new JLabel("Pin Number:");
        pinnumber.setBounds(390,260,126,25);
        panel.add(pinnumber);
        f_pinnumber= new JTextField();
        f_pinnumber.setBounds(510,262,180,32);
        panel.add(f_pinnumber);
        
        
        Summit = new JButton("Summit");
        Summit.setBounds(30,348,120,32);
        panel.add(Summit);
    
        
        Cancle = new JButton("Cancle");
        Cancle.setBounds(370,348,120,32);
        panel.add(Cancle);
        
        add_to_Bankcard = new JButton("Add to Bank Card");
        add_to_Bankcard.setBounds(180,348,158,32);
        panel.add(add_to_Bankcard);
        
        display = new JButton("Display");
        display.setBounds(510,348,158,32);
        panel.add(display);
        
        panel.setLayout(null);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
