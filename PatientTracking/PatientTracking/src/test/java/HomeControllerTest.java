
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

//import com.hcl.springregistration.controller.HomeController;
//import com.hcl.springregistration.controller.HomeController;
//import com.hcl.springregistration.controller.UserControler;
//import com.hcl.springregistration.model.User;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

public class HomeControllerTest {

	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HomeControllerTest()).build();
	}

	@Test
    public void testHomePage() throws Exception {
        this.mockMvc.perform(post("/"))
                .andExpect(status().isOk())
                //.andExpect(view().name("registration"))
                  .andExpect(redirectedUrl("user/registration"))
                //.andDo(MockMvcResultHandlers.print())
                .andReturn();
    }
}