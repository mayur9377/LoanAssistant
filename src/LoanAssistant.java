
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Insets;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import javax.swing.JTextField;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Excel Computer
 */
public class LoanAssistant extends javax.swing.JFrame{

    /**
     * Creates new form LoanAssistant
     */
    int months;
    double payment,bal,interest_rate,finalPayment;
    Color lightYellow=new Color(255,255,128);
    public LoanAssistant() {
        initComponents();
        JTextFieldDateEditor editor=(JTextFieldDateEditor)jDateChooser1.getDateEditor();
        editor.setEditable(false);
        editor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
       month_pay.setEnabled(false);
        month_pay.setVisible(false);
        //no_pay.setEnabled(false);
        //no_pay.setVisible(false);
        month_payment.setEditable(false);
        loanButton.setEnabled(false);
        month_payment.setBackground(Color.yellow);
        loan_statement.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        no_pay = new javax.swing.JButton();
        month_pay = new javax.swing.JButton();
        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea1 = new javax.swing.JTextArea();
        interest = new javax.swing.JTextField();
        no_payment = new javax.swing.JTextField();
        month_payment = new javax.swing.JTextField();
        exit = new javax.swing.JButton();
        loanButton = new javax.swing.JButton();
        compute = new javax.swing.JButton();
        loanBal = new javax.swing.JTextField();
        label6 = new java.awt.Label();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        loan_statement = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loan Assistant");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setPreferredSize(new java.awt.Dimension(600, 350));
        setResizable(false);

        label1.setText("Loan Balance (INR)");

        label2.setText("Interest Rate (%)");

        label3.setText("Number of Payments");

        label4.setText("Monthly Payment (INR)");

        label5.setText("Loan Analysis");

        no_pay.setText("X");
        no_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_payActionPerformed(evt);
            }
        });

        month_pay.setText("X");
        month_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_payActionPerformed(evt);
            }
        });

        textArea1.setColumns(20);
        textArea1.setLineWrap(true);
        textArea1.setRows(5);
        textArea1.setWrapStyleWord(true);
        textArea1.setBorder(null);
        textArea1.setFocusable(false);
        textArea1.setPreferredSize(new java.awt.Dimension(170, 200));
        textArea1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(textArea1);

        interest.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        interest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestActionPerformed(evt);
            }
        });

        no_payment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_paymentActionPerformed(evt);
            }
        });

        month_payment.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        month_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                month_paymentActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        loanButton.setText("New Loan Analysis");
        loanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanButtonActionPerformed(evt);
            }
        });

        compute.setText("Compute Monthly Payment");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });

        loanBal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        loanBal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loanBalActionPerformed(evt);
            }
        });

        label6.setText("Loan Grant Date");

        loan_statement.setText("Generate Loan Statement");
        loan_statement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loan_statementActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(label2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loanBal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(no_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(no_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(month_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(month_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(loanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(loan_statement))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loanBal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(interest, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(no_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(no_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(month_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(month_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(compute, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loan_statement, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textArea1ActionPerformed(java.awt.event.ActionEvent evt)
    {
        textArea1.transferFocus();
    }
    private void no_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_payActionPerformed
        // TODO add your handling code here:
        no_pay.setVisible(false);
        no_pay.setEnabled(false);
        month_pay.setEnabled(true);
        month_pay.setVisible(true);
        no_payment.setText("");
        no_payment.setEditable(false);
        no_payment.setBackground(lightYellow);
        no_payment.setFocusable(false);
        month_payment.setEditable(true);
        month_payment.setBackground(Color.WHITE);
        month_payment.setFocusable(true);
        compute.setText("Compute Number of Payments");
        loanBal.requestFocus();
        
    }//GEN-LAST:event_no_payActionPerformed

    private void month_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_payActionPerformed
        // TODO add your handling code here:
        no_pay.setVisible(true);
        no_pay.setEnabled(true);
        month_pay.setEnabled(false);
        month_pay.setVisible(false);
        no_payment.setEditable(true);
        no_payment.setBackground(Color.WHITE);
        no_payment.setFocusable(true);
        month_payment.setText("");
        month_payment.setEditable(false);
        month_payment.setBackground(lightYellow);
        month_payment.setFocusable(false);
        compute.setText("Compute Monthly Payment");
        loanBal.requestFocus();
        
        
    }//GEN-LAST:event_month_payActionPerformed

    private void interestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestActionPerformed
        // TODO add your handling code here:
        interest.transferFocus();
    }//GEN-LAST:event_interestActionPerformed

    private void no_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_paymentActionPerformed
        // TODO add your handling code here:
        no_payment.transferFocus();
    }//GEN-LAST:event_no_paymentActionPerformed

    private void month_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_month_paymentActionPerformed
        // TODO add your handling code here:
        month_payment.transferFocus();
    }//GEN-LAST:event_month_paymentActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void loanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanButtonActionPerformed
        // TODO add your handling code here:
        //if(no_pay.isEnabled())
         //{
         textArea1.setPreferredSize(new Dimension(170,200));
             month_payment.setText("");
         //}
         //else
         //{
             no_payment.setText("");
         //}
         textArea1.setText("");
         loanBal.setText("");
         interest.setText("");
         jDateChooser1.setCalendar(null);
         compute.setEnabled(true);
         loanButton.setEnabled(false);
         loan_statement.setEnabled(false);
         loanBal.requestFocus();
        loan_statement.setText("Generate Loan Statement");
    }//GEN-LAST:event_loanButtonActionPerformed

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
        double monthly_interest,multiplier,loanBalance;
        //int months;
        if(validate(loanBal))
        {
            //System.out.print("LOan balance validated");
        bal=Double.valueOf(loanBal.getText()).doubleValue();
        }
        else
        {
            jOptionPane1.showConfirmDialog(null,"Invalid or empty Loan Balance entry.\nPlease Correct","Balance Input Error",jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE);
            return;
        }
        if(validate(interest))
        {
        interest_rate=Double.valueOf(interest.getText()).doubleValue();
        }
        else
        {
            jOptionPane1.showConfirmDialog(null,"Invalid or empty Interest Rate entry.\nPlease correct","Interest Input Error",jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE);
            return;
        }
        monthly_interest=interest_rate/1200;
        
        if(no_pay.isEnabled())
        {
            if(validate(no_payment))
            {
                months=Integer.valueOf(no_payment.getText()).intValue();
                if(months<1)
                {
                   if(jOptionPane1.showConfirmDialog(null,"Minimum number of months must be 1"+"\n"+"Do you want to use the minimum months?","Input Error",jOptionPane1.YES_NO_OPTION,jOptionPane1.QUESTION_MESSAGE)==jOptionPane1.YES_OPTION)
                {
                    no_payment.setText("1");
                    months=Integer.valueOf(no_payment.getText()).intValue();
                }  
                else
                {
                    no_payment.requestFocus();
                    return;
                } 
                }
            }
            else
            {
                jOptionPane1.showConfirmDialog(null,"Invalid or empty Number of Payments.\nPlease correct","Number of Paymnets Input Error",jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE);
                return;
            }
        if(interest_rate==0)
        {
            payment=bal/months;
        }
        else
        {
        multiplier=Math.pow(1+monthly_interest,months);
        payment=bal*monthly_interest*multiplier/(multiplier-1);
        }
        if(no_payment.getText().equals("1"))
            payment=Integer.parseInt(loanBal.getText());
        month_payment.setText(new DecimalFormat("0.00").format(payment));
        }
        else
        {
            if(validate(month_payment))
            {
            payment=Double.valueOf(month_payment.getText()).doubleValue();
            if(Double.parseDouble(new DecimalFormat("0.00").format(payment))<(int)(bal*monthly_interest+1.0))
            {
                //System.out.print(bal*monthly_interest+1.0);
                if(jOptionPane1.showConfirmDialog(null,"Minimum payment must be INR "+new DecimalFormat("0.00").format((int)(bal*monthly_interest+1.0))+"\n"+"Do you want to use the minimum payment?","Input Error",jOptionPane1.YES_NO_OPTION,jOptionPane1.QUESTION_MESSAGE)==jOptionPane1.YES_OPTION)
                {
                    month_payment.setText(new DecimalFormat("0.00").format((int)(bal*monthly_interest+1.0)));
                    payment=Double.valueOf(month_payment.getText()).doubleValue();
                }  
                else
                {
                    month_payment.requestFocus();
                    return;
                }
            }
            else if(Double.parseDouble(loanBal.getText())<Double.parseDouble(month_payment.getText()))
            {
                if(jOptionPane1.showConfirmDialog(null,"Maximum payment allowed is INR "+new DecimalFormat("0.00").format(Double.parseDouble(loanBal.getText()))+"\n"+"Do you want to use the maximum payment?","Input Error",jOptionPane1.YES_NO_OPTION,jOptionPane1.QUESTION_MESSAGE)==jOptionPane1.YES_OPTION)
                {
                    month_payment.setText(new DecimalFormat("0.00").format(Double.parseDouble(loanBal.getText())));
                    payment=Double.valueOf(month_payment.getText()).doubleValue();
                }  
                else
                {
                    month_payment.requestFocus();
                    return;
                }
            }
            }
            
            else
            {
                jOptionPane1.showConfirmDialog(null,"Invalid or empty Monthly Payment entry.\nPlease correct","Payment Input Error",jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE);
                return;
            }
            if(interest_rate==0)
            {
                months=(int)(bal/payment);
            }
            else
            {
            months=(int)((Math.log(payment)-Math.log(payment-bal*monthly_interest))/Math.log(1+monthly_interest));
            }
            no_payment.setText(String.valueOf(months));
        }
        
        payment=Double.valueOf(month_payment.getText()).doubleValue();
        
        if(jDateChooser1.getDate()==null)
        {
            if(jOptionPane1.showConfirmDialog(null,"Date can't be empty."+"\n"+"Do you want to apply current date?","Invalid Date",jOptionPane1.YES_NO_OPTION,jOptionPane1.QUESTION_MESSAGE)==jOptionPane1.YES_OPTION)
            {
                jDateChooser1.setDate(new Date());
            }
            else
            {
                jDateChooser1.requestFocus();
                return;
            }
        }
        textArea1.setText("Loan Balance: Rs "+new DecimalFormat("0.00").format(bal));
        textArea1.append("\n"+"Interest Rate: "+new DecimalFormat("0.00").format(interest_rate)+"%");
        loanBalance=bal;
        for(int paymentNumber=1;paymentNumber<=months-1;paymentNumber++)
        {
            loanBalance+=loanBalance*monthly_interest-payment;
        }
        
        finalPayment=loanBalance;
        if(finalPayment>payment)
        {
            //append one more payment
            loanBalance+=loanBalance*monthly_interest-payment;
            finalPayment=loanBalance;
            months++;
            no_payment.setText(String.valueOf(months));
        }
        
        textArea1.append("\n");
        if(!(loanBal.getText().equals(month_payment.getText()) || no_payment.getText().equals("1")))
            textArea1.append("\n"+String.valueOf(months-1)+" Payments of Rs "+new DecimalFormat("0.00").format(payment));
        textArea1.append("\n"+"Final Payment of: Rs "+new DecimalFormat("0.00").format(finalPayment));
        textArea1.append("\n"+"Total Payment: Rs "+new DecimalFormat("0.00").format((months-1)*payment+finalPayment));
        textArea1.append("\n"+"Interest Paid: Rs "+new DecimalFormat("0.00").format((months-1)*payment+finalPayment-bal));
        textArea1.append("\n\n"+"Loan Starts on: "+jDateChooser1.getDate().toString().substring(0,11)+jDateChooser1.getDate().toString().substring(24));
        Date new_date=DateUtils.addMonths(jDateChooser1.getDate(), Integer.parseInt(no_payment.getText()));
        textArea1.append("\n"+"Loan Ends on: "+new_date.toString().substring(0,11)+new_date.toString().substring(24));
        
        loan_statement.setEnabled(true);
        compute.setEnabled(false);
        loanButton.setEnabled(true);
        loanButton.requestFocus();
    }//GEN-LAST:event_computeActionPerformed

    private void loanBalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loanBalActionPerformed
        // TODO add your handling code here:
        loanBal.transferFocus();
    }//GEN-LAST:event_loanBalActionPerformed

    private void loan_statementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loan_statementActionPerformed
        // TODO add your handling code here:
        //JScrollPane jScrollPane=new JScrollPane(textArea1);
        //loan_statement.setEnabled(false);
        if(loan_statement.getText().toString().equals("Generate Loan Statement"))
        {
        textArea1.setText("");
        
        Date temp_date=jDateChooser1.getDate();
        textArea1.setText("Loan Statement\n\n");
        textArea1.append("Loan Balance: Rs "+new DecimalFormat("0.00").format(bal));
        textArea1.append("\n"+"Interest Rate: "+new DecimalFormat("0.00").format(interest_rate)+"%");
        textArea1.append("\n"+"Loan Starts on: "+jDateChooser1.getDate().toString().substring(0,11)+jDateChooser1.getDate().toString().substring(24));
        textArea1.append("\n"+"Loan Ends on: "+DateUtils.addMonths(jDateChooser1.getDate(), Integer.parseInt(no_payment.getText())).toString().substring(0,11)+DateUtils.addMonths(jDateChooser1.getDate(), Integer.parseInt(no_payment.getText())).toString().substring(24)+"\n\n");
        int i;
        for(i=1;i<months;i++)
        {
            textArea1.append("Installment "+i+"\n");
            textArea1.append("Date: "+temp_date.toString().substring(0,11)+temp_date.toString().substring(24)+"\n");
            textArea1.append("Amount: Rs "+new DecimalFormat("0.00").format(payment)+"\n\n");
            temp_date=DateUtils.addMonths(temp_date,1);
            //System.out.println((int)textArea1.getPreferredSize().getWidth());
            //System.out.println((int)textArea1.getPreferredSize().getHeight());
            textArea1.setPreferredSize(new Dimension((int)textArea1.getPreferredSize().getWidth(),100+(int)textArea1.getPreferredSize().getHeight()));
        }
        
        textArea1.append("Installment "+i+" (Final Payment)\n");
        textArea1.append("Date: "+temp_date.toString().substring(0,11)+temp_date.toString().substring(24)+"\n");
        textArea1.append("Amount: Rs "+new DecimalFormat("0.00").format((months-1)*payment+finalPayment)+"\n\n");
        textArea1.append("Total Amount (including interest):\nRs "+new DecimalFormat("0.00").format((months-1)*payment+finalPayment));
        textArea1.append("\n"+"Interest Paid: Rs "+new DecimalFormat("0.00").format((months-1)*payment+finalPayment-bal));
        loan_statement.setText("Generate statement PDF");
        }
        else
        {
            Document doc = new Document();  
try  
{  
//generate a PDF at the specified location  
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream(System.getProperty("user.home")+"\\Downloads\\loan_statement.pdf"));  
//System.out.println("PDF created.");  
//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph(textArea1.getText()));   
//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
}   
catch (DocumentException e)  
{  
e.printStackTrace();  
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}
    loan_statement.setEnabled(false);
    jOptionPane1.showConfirmDialog(null,"Your loan statement PDF has been generated successfully.\nGo to Downloads and check loan_statement.pdf","Loan Assistant",jOptionPane1.DEFAULT_OPTION,jOptionPane1.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loan_statementActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoanAssistant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoanAssistant().setVisible(true);
            }
        });
        
    }
    
    public boolean validate(JTextField tf)
    {
        String s= tf.getText().trim();
        boolean hasDecimal= false;
        boolean valid=true;
        
        if(s.length()==0)
        {
            valid=false;
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                if(c>='0' && c<='9')
                {
                    continue;
                }
                else if(c=='.' && !hasDecimal)
                {
                    hasDecimal=true;
                }
                else
                {
                    valid=false;
                }
            }
        }
            
        tf.setText(s);
        if(!valid)
        {
            tf.requestFocus();
        }
        return(valid);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compute;
    private javax.swing.JButton exit;
    private javax.swing.JTextField interest;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JTextField loanBal;
    private javax.swing.JButton loanButton;
    private javax.swing.JButton loan_statement;
    private javax.swing.JButton month_pay;
    private javax.swing.JTextField month_payment;
    private javax.swing.JButton no_pay;
    private javax.swing.JTextField no_payment;
    private javax.swing.JTextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
