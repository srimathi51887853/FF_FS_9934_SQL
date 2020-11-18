import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

 

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.patienttracking.model.User;
//import com.hcl.hospitalmanagement.controller.UserController;
//import com.hcl.hospitalmanagement.model.User;

 

public class UserControllerTest {
    private MockMvc mockMvc;

 

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new UserControllerTest()).build();
    }

 

    @Test
    public void testHomePage() throws Exception {
        User user = new User();
        user.setId(1);
        user.setFirstName("sri");
        user.setLastName("mathi");
        user.setAge(12);
        user.setGender("female");
        user.setEmailId("abcd@hcl.com");
        user.setPassword("123");
        user.setPhoneNumber(1234);
        user.setRoleId(1);

 

        this.mockMvc
                .perform(post("/user/registration")
                		.content(asJsonString(user)).contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).
                andExpect(view().name("LoginSuccess"))
                // .andExpect(redirectedUrl("/registration"))
                // .andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}