package ie.gmit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    private Employee myEmployee;


    @BeforeEach
    void init() {
        myEmployee = new Employee("Mrs","Guo", "N123456", "12345678", "Full time",18);
    }


    @Test
    void setTitle() {
        String invalid = "Invalid title provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setTitle("Mrss"));
        assertEquals(invalid, exceptionThrown.getMessage());
    }

    @Test
    void setName() {
        String invalid2 = "Invalid name provided";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setName("Gu"));
        assertEquals(invalid2, exceptionThrown.getMessage());
    }

    @Test
    void setPpS() {
        String invalid3 = "Invalid pps error";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setPps("12345"));
        assertEquals(invalid3, exceptionThrown.getMessage());
    }
    @Test
    void setPhone() {
        String invalid4 = "Invalid phone number error";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setPhone("12345678"));
        assertEquals(invalid4, exceptionThrown.getMessage());
    }
    @Test
    void setType() {
        String invalid5 = "Invalid employment type error";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setType("time"));
        assertEquals(invalid5, exceptionThrown.getMessage());
    }
    @Test
    void setAge() {
        String invalid6 = "Age should be above 16";
        Exception exceptionThrown = assertThrows(IllegalArgumentException.class, ()->myEmployee.setAge(11));
        assertEquals(invalid6, exceptionThrown.getMessage());
    }





}
