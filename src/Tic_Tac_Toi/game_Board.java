package Tic_Tac_Toi;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class game_Board extends javax.swing.JFrame {
    int turn=2;
    private int xCount=0;
    private int oCount=0;
    int[] jbuttonused={0,0,0,0,0,0,0,0,0};
    boolean win;
    int rest=0;
    
    public void screen(String x){
        if(x=="X"){
        screen.setText(user2.getText()+" Will play now");
        }else if(x=="O"){
            screen.setText(user1.getText()+" Will play now");
        }
    }
    private String choose_a_Player(){
        String startGame="";
        if(startGame.equalsIgnoreCase("X")){
            startGame="O";
        }else{
            startGame="X";
        }
        return startGame;
    }
  String an,bn;
  
  
    public void setName(String x, String y){
        an=x;
        bn=y;
        user1.setText(x);
        user2.setText(y);
        screen.setText(x+" Will Play Now");
          
    }
    
   



    public void getTheWinner(){ 
        if(!jbutton1.getText().equals("") && jbutton1.getText().equals(jbutton2.getText()) && jbutton1.getText().equals(jbutton3.getText())){
            winEffect(jbutton1, jbutton2, jbutton3);
            win = true;
            if(jbutton1.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        else if(!jbutton4.getText().equals("") && jbutton4.getText().equals(jbutton5.getText()) && jbutton4.getText().equals(jbutton6.getText())){
            winEffect(jbutton4, jbutton5, jbutton6);
            win = true;
            if(jbutton4.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        else if(!jbutton7.getText().equals("") && jbutton7.getText().equals(jbutton8.getText()) && jbutton7.getText().equals(jbutton9.getText())){
            winEffect(jbutton7, jbutton8, jbutton9);
            win = true;
            if(jbutton7.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        else if(!jbutton1.getText().equals("") && jbutton1.getText().equals(jbutton4.getText()) && jbutton1.getText().equals(jbutton7.getText())){
            winEffect(jbutton1, jbutton4, jbutton7);
            win = true;
            if(jbutton4.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        else if(!jbutton2.getText().equals("") && jbutton2.getText().equals(jbutton5.getText()) && jbutton2.getText().equals(jbutton8.getText())){
           winEffect(jbutton2, jbutton5, jbutton8);
           win = true;
           if(jbutton2.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        if(!jbutton3.getText().equals("") && jbutton3.getText().equals(jbutton6.getText()) && jbutton3.getText().equals(jbutton9.getText())){
            winEffect(jbutton3, jbutton6, jbutton9);
            win = true;
            if(jbutton3.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        
        else if(!jbutton1.getText().equals("") && jbutton1.getText().equals(jbutton5.getText()) && jbutton1.getText().equals(jbutton9.getText())){
            winEffect(jbutton1, jbutton5, jbutton9);
            win = true;
            if(jbutton1.getText()=="X"){
                xCount++;
            }else oCount++;
        }
        
        else if(!jbutton3.getText().equals("") && jbutton3.getText().equals(jbutton5.getText()) && jbutton3.getText().equals(jbutton7.getText())){
            winEffect(jbutton3, jbutton5, jbutton7);
            win = true;
            if(jbutton3.getText()=="X"){
                xCount++;
            }else oCount++;
        }else if(allButtonsTextLength() == 9 && win==false){
            
            JOptionPane.showMessageDialog(this,"No one Win","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
    // if no one win
    public int allButtonsTextLength(){
        
        // all buttons text length mean if 
        // all buttons text length = 9
        // all buttons with text on them

        String txt = "";
        
        Component[] comps = jboard.getComponents();
        
        for(Component comp : comps){
            if(comp instanceof JButton){
                JButton button = (JButton)comp;
                 txt = txt + button.getText();
            }
        }
        return txt.length();
    }
    public game_Board() {
        initComponents();
    }
    public void winEffect(JButton b1, JButton b2, JButton b3)
    {
        b1.setBackground(Color.YELLOW);
        b2.setBackground(Color.YELLOW);
        b3.setBackground(Color.YELLOW);
        
        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        
        String msg = b1.getText();
        
        if(msg=="X"){
            JOptionPane.showMessageDialog(fram,user1.getText() +" IS THE WINNER");
            
        }
        if(msg=="O"){
            JOptionPane.showMessageDialog(fram,user2.getText() +" IS THE WINNER");
           
        }
        
        
        
        
    }
    
    
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jboard = new javax.swing.JPanel();
        jbutton9 = new javax.swing.JButton();
        jbutton1 = new javax.swing.JButton();
        jbutton2 = new javax.swing.JButton();
        jbutton3 = new javax.swing.JButton();
        jbutton4 = new javax.swing.JButton();
        jbutton5 = new javax.swing.JButton();
        jbutton6 = new javax.swing.JButton();
        jbutton7 = new javax.swing.JButton();
        jbutton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jplayerXpoint = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jplayerOpoint = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        user2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jexitbutton = new javax.swing.JButton();
        jnewgamebutton = new javax.swing.JButton();
        jresetbutton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        screen = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 255), new java.awt.Color(51, 255, 255), new java.awt.Color(0, 255, 255), new java.awt.Color(0, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jboard.setBackground(new java.awt.Color(204, 0, 204));
        jboard.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbutton9.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton9ActionPerformed(evt);
            }
        });
        jboard.add(jbutton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 140, 120));

        jbutton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton1.setForeground(new java.awt.Color(0, 0, 0));
        jbutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton1ActionPerformed(evt);
            }
        });
        jboard.add(jbutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 130));

        jbutton2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton2ActionPerformed(evt);
            }
        });
        jboard.add(jbutton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 140, 130));

        jbutton3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton3ActionPerformed(evt);
            }
        });
        jboard.add(jbutton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 140, 130));

        jbutton4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton4ActionPerformed(evt);
            }
        });
        jboard.add(jbutton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 140, 130));

        jbutton5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton5ActionPerformed(evt);
            }
        });
        jboard.add(jbutton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 140, 130));

        jbutton6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton6ActionPerformed(evt);
            }
        });
        jboard.add(jbutton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 140, 130));

        jbutton7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton7ActionPerformed(evt);
            }
        });
        jboard.add(jbutton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 140, 120));

        jbutton8.setFont(new java.awt.Font("Tempus Sans ITC", 1, 90)); // NOI18N
        jbutton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton8ActionPerformed(evt);
            }
        });
        jboard.add(jbutton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, 120));

        jPanel3.add(jboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 460, 420));

        jPanel5.setBackground(new java.awt.Color(204, 0, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user1.setBackground(new java.awt.Color(0, 0, 0));
        user1.setFont(new java.awt.Font("Engravers MT", 1, 25)); // NOI18N
        user1.setForeground(new java.awt.Color(0, 0, 0));
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("player X");
        user1.setToolTipText("");
        jPanel6.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 220, 70));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplayerXpoint.setBackground(new java.awt.Color(0, 0, 0));
        jplayerXpoint.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jplayerXpoint.setForeground(new java.awt.Color(0, 0, 0));
        jplayerXpoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jplayerXpoint.setText("0");
        jPanel7.add(jplayerXpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 220, 70));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jplayerOpoint.setBackground(new java.awt.Color(0, 0, 0));
        jplayerOpoint.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jplayerOpoint.setForeground(new java.awt.Color(0, 0, 0));
        jplayerOpoint.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jplayerOpoint.setText("0");
        jPanel8.add(jplayerOpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 220, 70));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user2.setBackground(new java.awt.Color(0, 0, 0));
        user2.setFont(new java.awt.Font("Engravers MT", 1, 25)); // NOI18N
        user2.setForeground(new java.awt.Color(0, 0, 0));
        user2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user2.setText("player O");
        jPanel9.add(user2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 220, 50));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 70));

        jPanel10.setBackground(new java.awt.Color(255, 153, 0));
        jPanel10.setForeground(new java.awt.Color(255, 153, 0));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Engravers MT", 1, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SCORE BOARD");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 370, 50));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 70));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 470, 250));

        jPanel11.setBackground(new java.awt.Color(204, 0, 204));
        jPanel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jexitbutton.setBackground(new java.awt.Color(255, 0, 0));
        jexitbutton.setFont(new java.awt.Font("Engravers MT", 1, 35)); // NOI18N
        jexitbutton.setText("Exit");
        jexitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jexitbuttonActionPerformed(evt);
            }
        });
        jPanel11.add(jexitbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 220, 50));

        jnewgamebutton.setBackground(new java.awt.Color(0, 204, 204));
        jnewgamebutton.setFont(new java.awt.Font("Engravers MT", 1, 35)); // NOI18N
        jnewgamebutton.setText("NEW GAME");
        jnewgamebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnewgamebuttonActionPerformed(evt);
            }
        });
        jPanel11.add(jnewgamebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 50));

        jresetbutton.setBackground(new java.awt.Color(0, 204, 0));
        jresetbutton.setFont(new java.awt.Font("Engravers MT", 1, 35)); // NOI18N
        jresetbutton.setText("RESET");
        jresetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jresetbuttonActionPerformed(evt);
            }
        });
        jPanel11.add(jresetbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 220, 50));

        jPanel3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 470, 130));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        screen.setBackground(new java.awt.Color(255, 255, 255));
        screen.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        screen.setForeground(new java.awt.Color(0, 0, 0));
        screen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel12.add(screen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 460, 50));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Felix Titling", 1, 90)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel13.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 90));

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 940, 90));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 980, 680));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1020, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton9ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[8]==0){
            if(turn%2==0){
                turn++;
                jbutton9.setText("X");
                jbuttonused[8]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton9.setText("O");
                jbuttonused[8]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton9.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else{
            jplayerOpoint.setText(String.valueOf(oCount));
        }

    }//GEN-LAST:event_jbutton9ActionPerformed

    private void jbutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton1ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[0]==0){
            if(turn%2==0){
                turn++;
                jbutton1.setText("X");
                jbuttonused[0]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton1.setText("O");
                jbuttonused[0]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton1.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton1ActionPerformed

    private void jbutton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton2ActionPerformed
        // TODO add your handling code here:

        allButtonsTextLength();
        if(jbuttonused[1]==0){
            if(turn%2==0){
                turn++;
                jbutton2.setText("X");
                jbuttonused[1]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton2.setText("O");
                jbuttonused[1]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton2.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton2ActionPerformed

    private void jbutton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton3ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[2]==0){
            if(turn%2==0){
                turn++;
                jbutton3.setText("X");
                jbuttonused[2]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton3.setText("O");
                jbuttonused[2]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton3.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton3ActionPerformed

    private void jbutton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton4ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[3]==0){
            if(turn%2==0){
                turn++;
                jbutton4.setText("X");
                jbuttonused[3]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton4.setText("O");
                jbuttonused[3]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton4.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton4ActionPerformed

    private void jbutton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton5ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[4]==0){
            if(turn%2==0){
                turn++;
                jbutton5.setText("X");
                jbuttonused[4]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton5.setText("O");
                jbuttonused[4]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton5.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton5ActionPerformed

    private void jbutton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton6ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[5]==0){
            if(turn%2==0){
                turn++;
                jbutton6.setText("X");
                jbuttonused[5]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton6.setText("O");
                jbuttonused[5]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton6.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton6ActionPerformed

    private void jbutton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton7ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[6]==0){
            if(turn%2==0){
                turn++;
                jbutton7.setText("X");
                jbuttonused[6]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton7.setText("O");
                jbuttonused[6]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton7.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton7ActionPerformed

    private void jbutton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton8ActionPerformed
        // TODO add your handling code here:
        allButtonsTextLength();
        if(jbuttonused[7]==0){
            if(turn%2==0){
                turn++;
                jbutton8.setText("X");
                jbuttonused[7]=1;
                screen("X");
            }
            else{
                turn++;
                jbutton8.setText("O");
                jbuttonused[7]=1;
                screen("O");
            }
        }else{
            JOptionPane.showMessageDialog(rootPane,"This Button is Already Used.");

        }
        getTheWinner();
        if(jbutton8.getText()=="X"){
            jplayerXpoint.setText(String.valueOf(xCount));
        }else jplayerOpoint.setText(String.valueOf(oCount));

    }//GEN-LAST:event_jbutton8ActionPerformed

    
        private JFrame fram;
    private void jexitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jexitbuttonActionPerformed
        // TODO add your handling code here:
        fram=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(fram,"Confirm if you want to Exit","Tic Tac Toi",
            JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
        System.exit(0);
        }
    }//GEN-LAST:event_jexitbuttonActionPerformed

    private void jnewgamebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnewgamebuttonActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jbuttonused[0]=0;
        jbuttonused[1]=0;
        jbuttonused[2]=0;
        jbuttonused[3]=0;
        jbuttonused[4]=0;
        jbuttonused[5]=0;
        jbuttonused[6]=0;
        jbuttonused[7]=0;
        jbuttonused[8]=0;

        jbutton1.setEnabled(true);
        jbutton2.setEnabled(true);
        jbutton3.setEnabled(true);
        jbutton4.setEnabled(true);
        jbutton5.setEnabled(true);
        jbutton6.setEnabled(true);
        jbutton7.setEnabled(true);
        jbutton8.setEnabled(true);
        jbutton9.setEnabled(true);

        jplayerXpoint.setText("0");
        jplayerOpoint.setText("0");

        screen.setText(user1.getText()+" Will Play Now");

        jbutton1.setBackground(Color.LIGHT_GRAY);
        jbutton2.setBackground(Color.LIGHT_GRAY);
        jbutton3.setBackground(Color.LIGHT_GRAY);
        jbutton4.setBackground(Color.LIGHT_GRAY);
        jbutton5.setBackground(Color.LIGHT_GRAY);
        jbutton6.setBackground(Color.LIGHT_GRAY);
        jbutton7.setBackground(Color.LIGHT_GRAY);
        jbutton8.setBackground(Color.LIGHT_GRAY);
        jbutton9.setBackground(Color.LIGHT_GRAY);

        xCount=0;
        oCount=0;

        jbutton1.setText("");
        jbutton2.setText("");
        jbutton3.setText("");
        jbutton4.setText("");
        jbutton5.setText("");
        jbutton6.setText("");
        jbutton7.setText("");
        jbutton8.setText("");
        jbutton9.setText("");

    }//GEN-LAST:event_jnewgamebuttonActionPerformed

    private void jresetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jresetbuttonActionPerformed
        // TODO add your handling code here:
        choose_a_Player();
        jbuttonused[0]=0;
        jbuttonused[1]=0;
        jbuttonused[2]=0;
        jbuttonused[3]=0;
        jbuttonused[4]=0;
        jbuttonused[5]=0;
        jbuttonused[6]=0;
        jbuttonused[7]=0;
        jbuttonused[8]=0;

        jbutton1.setEnabled(true);
        jbutton2.setEnabled(true);
        jbutton3.setEnabled(true);
        jbutton4.setEnabled(true);
        jbutton5.setEnabled(true);
        jbutton6.setEnabled(true);
        jbutton7.setEnabled(true);
        jbutton8.setEnabled(true);
        jbutton9.setEnabled(true);

        jbutton1.setBackground(Color.LIGHT_GRAY);
        jbutton2.setBackground(Color.LIGHT_GRAY);
        jbutton3.setBackground(Color.LIGHT_GRAY);
        jbutton4.setBackground(Color.LIGHT_GRAY);
        jbutton5.setBackground(Color.LIGHT_GRAY);
        jbutton6.setBackground(Color.LIGHT_GRAY);
        jbutton7.setBackground(Color.LIGHT_GRAY);
        jbutton8.setBackground(Color.LIGHT_GRAY);
        jbutton9.setBackground(Color.LIGHT_GRAY);

        jbutton1.setText("");
        jbutton2.setText("");
        jbutton3.setText("");
        jbutton4.setText("");
        jbutton5.setText("");
        jbutton6.setText("");
        jbutton7.setText("");
        jbutton8.setText("");
        jbutton9.setText("");
    }//GEN-LAST:event_jresetbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(game_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game_Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game_Board().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jboard;
    private javax.swing.JButton jbutton1;
    private javax.swing.JButton jbutton2;
    private javax.swing.JButton jbutton3;
    private javax.swing.JButton jbutton4;
    private javax.swing.JButton jbutton5;
    private javax.swing.JButton jbutton6;
    private javax.swing.JButton jbutton7;
    private javax.swing.JButton jbutton8;
    private javax.swing.JButton jbutton9;
    private javax.swing.JButton jexitbutton;
    private javax.swing.JButton jnewgamebutton;
    private javax.swing.JLabel jplayerOpoint;
    private javax.swing.JLabel jplayerXpoint;
    private javax.swing.JButton jresetbutton;
    private javax.swing.JLabel screen;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    // End of variables declaration//GEN-END:variables
}
