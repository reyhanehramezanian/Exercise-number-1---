class SmsSender implements MessageSender {
 
    @Override
    public void sendEmail(String to, String message) {
         this.sendSms(to, message);
    }
    
     public void sendSms(String to, String message) {
        System.out.println("---  Start sending SMS ---");
        System.out.println("Sending SMS to " + to + ": " + message);
        System.out.println("-------------------------");
    }

}
