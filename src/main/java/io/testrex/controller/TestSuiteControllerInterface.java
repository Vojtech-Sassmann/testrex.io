package io.testrex.controller;

import io.testrex.model.TestSuite;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Vojtech Sassmann <vojtech.sassmann@gmail.com>
 */
public interface TestSuiteControllerInterface {

	ResponseEntity<TestSuite> findById(@PathVariable Long id, @PathVariable Long projectId);
	List<ResponseEntity<TestSuite>> findAll(@PathVariable Long projectId);
	ResponseEntity<TestSuite> create(@RequestBody TestSuite testSuite, @PathVariable Long projectId);
	ResponseEntity<?> delete(@PathVariable Long id, @PathVariable Long projectId);
	ResponseEntity<TestSuite> put(@PathVariable Long id, @RequestBody TestSuite newTestSuite, @PathVariable Long projectId);
}
