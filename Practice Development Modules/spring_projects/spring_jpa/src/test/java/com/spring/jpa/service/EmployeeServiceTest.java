package com.spring.jpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring.jpa.repository.EmployeeRepository;



@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	/*
	 * Another way to create mock - use below code in method with @BeforeEach
	 * 
	 * EmployeeRepository empRepo = mock(EmployeeRepository.class); EmployeeService
	 * empService = new EmployeeService(empRepo);
	 */

	@InjectMocks
	private EmployeeService empService;

	// If @Mock is used, then it is mandatory to use openMocks
	@Mock
	private EmployeeRepository empRepo;

	@BeforeEach
	public void setUp() {
		// To enable Mockito annotations
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void getEmployees() {
		/*
		 * Block - 1
		 */
		assertEquals(empRepo.findById(1), empRepo.findById(1));
		assertEquals(empRepo.findById(1), empRepo.findById(2));

		verify(empRepo, times(3)).findById(1);
		verify(empRepo, times(1)).findById(2);

		/*
		 * Block - 2: Do not remove, useful for debugging and understanding
		 * working of mockito
		 * The below verify method works if empService does not use empRepo 
		 * and instead use someother repo
		 * 
		 * Uncomment below code & comment Block - 1 to run
		 */
	
		
//		verifyNoInteractions(empService, empRepo);

	}

}
