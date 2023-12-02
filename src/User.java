public class User extends Person{
    private String username;
    private String password;
    private String email;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    private String ticketPreference;
    private String tripPreference;
    private String accommodationPreference;
    private String travelHistory;

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public User(String username, String password, String email, String name, int SSN, String gender, int phone_number, String nationality) {
        super(name, SSN, gender, phone_number, nationality);
        this.username = username;
        this.password = password;
        this.email = email;
        this.ticketPreference = "";
        this.tripPreference = "";
        this.accommodationPreference = "";
    }

    public String getTicketPreference() {
        return ticketPreference;
    }

    public void setTicketPreference(String ticketPreference) {
        this.ticketPreference = ticketPreference;
    }

    public String getTripPreference() {
        return tripPreference;
    }

    public void setTripPreference(String tripPreference) {
        this.tripPreference = tripPreference;
    }

    public String getAccommodationPreference() {
        return accommodationPreference;
    }

    public void setAccommodationPreference(String accommodationPreference) {
        this.accommodationPreference = accommodationPreference;
    }
    public String getTravelHistory() {
        return travelHistory;
    }
    public void setTravelHistory(String travelHistory) {
        this.travelHistory = travelHistory;
    }
    public static User createAccount(String username, String password, String email,String name,int SSN,String gender,int phone_number,String nationality) {
        return new User(username,  password,  email, name, SSN, gender, phone_number, nationality);
    }
    public void updateName(String name) {
        this.setName(name);
    }

    public void updateEmail(String email) {
        this.email = email;
    }

    public void updatePhoneNumber( int phone_number) {
        this.setPhone_number(phone_number);
    }
}
