package com.java.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.java.junit.module.Calculator;

@SpringBootTest
class JUnitTestApplicationTests {

	@Test
	void contextLoads() {

	}

}

/*
	3 Ways to enable Mockito annotation

1. @ExtendWith(MockitoExtension.class) 
Add to the test class - not working, 
Add mockito-junit-jupiter dependencies - working

2. When using @Mock & @InjectMocks
Add MockitoAnnotations.openMocks(this) 
in a setup method with @BeforeEach annotation - working

3. Check later

		
			Creating Mocks

1. Using @Mock & @InjectMocks
2. Using mock() method

@BeforeEach
public void setUp() {
empRepo = Mockito.mock(EmployeeRepository.class);
empService = new EmployeeService(empRepo);
}	



Important things to be followed

1. @ExtendWith, @Mock, @InjectMocks, openMocks - Used together
2. Test methods need to be public, void - Reflection might be used
3. Another way to mock with out using @Mock and @InjectMocks



	Static or non static methods for different annotations

1. @BeforeAll annotation to Static method 
2. @AfterAll annotation to Static method 
3. @BeforeEach, @Test, @AfterEach annotation to Non-static test method

*/