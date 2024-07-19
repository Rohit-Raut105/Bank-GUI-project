
/**
 * Write a description of class DebitCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JButton;
public class DebitCard
{
    JFrame frame;
    JPanel panel;
    JLabel pinnumber,withdrawamount,dateofwithdraw,withdrawalamount,clientname,balanceamount,cardid,bankaccount,issuerbank;
    JTextField f_pinnumber,f_withdrawamount,f_dateofwithdraw,f_withdrawalamount,f_clientname,f_balanceamount,f_cardid,f_bankaccount,f_issuerbank;
    JButton withdraw_from_debitcard,cancel,display;

    DebitCard(){
        frame = new JFrame("DebitCard");
        panel = new JPanel();
        frame.add(panel);

        pinnumber = new JLabel("Pin Number:");
        pinnumber.setBounds(14,67,107,25);
        panel.add(pinnumber);
        f_pinnumber = new JTextField();
        f_pinnumber.setBounds(195,67,150,27);
        panel.add(f_pinnumber);

        withdrawamount = new JLabel("Withdraw Amount:");
        withdrawamount.setBounds(14,118,159,25);
        panel.add(withdrawamount);
        f_withdrawamount = new JTextField();
        f_withdrawamount.setBounds(195,118,150,27);
        panel.add(f_withdrawamount);

        dateofwithdraw = new JLabel("Date of Withdrawal:");
        dateofwithdraw.setBounds(14,169,153,25);
        panel.add(dateofwithdraw);
        f_dateofwithdraw = new JTextField();
        f_dateofwithdraw.setBounds(197,168,150,27);
        panel.add(f_dateofwithdraw);

        withdrawalamount = new JLabel("Withdrawal Amount:");
        withdrawalamount.setBounds(11,220,171,25);
        panel.add(withdrawalamount);
        f_withdrawalamount = new JTextField();
        f_withdrawalamount.setBounds(195,220,150,27);
        panel.add(f_withdrawalamount);

        clientname = new JLabel("Client Name:");
        clientname.setBounds(11,277,110,25);
        panel.add(clientname);
        f_clientname = new JTextField();
        f_clientname.setBounds(195,271,150,27);
        panel.add(f_clientname);

        balanceamount = new JLabel("Balance Amount:");
        balanceamount.setBounds(393,67,147,25);
        panel.add(balanceamount);
        f_balanceamount = new JTextField();
        f_balanceamount.setBounds(530,67,150,27);
        panel.add(f_balanceamount);

        cardid = new JLabel("Card Id:");
        cardid.setBounds(393,118,68,25);
        panel.add(cardid);
        f_cardid = new JTextField();
        f_cardid.setBounds(530,118,150,27);
        panel.add(f_cardid);

        bankaccount = new JLabel("Bank Account");
        bankaccount.setBounds(393,168,126,25);
        panel.add(bankaccount);
        f_bankaccount = new JTextField();
        f_bankaccount.setBounds(530,168,150,27);
        panel.add(f_bankaccount);

        issuerbank = new JLabel("Issuer Bank:");
        issuerbank.setBounds(393,220,108,25);
        panel.add(issuerbank);
        f_issuerbank = new JTextField();
        f_issuerbank.setBounds(530,220,150,27);
        panel.add(f_issuerbank);

        withdraw_from_debitcard = new JButton("Withdraw from DebitCard");
        withdraw_from_debitcard.setBounds(68,359,191,46);
        panel.add(withdraw_from_debitcard);

        cancel = new JButton("Cancel");
        cancel.setBounds(316,359,101,46);
        panel.add(cancel);
        
        display= new JButton("Display");
        display.setBounds(474,359,101,46);
        panel.add(display);
        

        panel.setLayout(null);
        frame.add(panel);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
    }

}
