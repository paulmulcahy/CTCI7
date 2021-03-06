package ca.pmulcahy.ctci6.chp1.q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestAllUniqueCharacters_WithAdditionalDataStructure {

	@Test
	public void stringWithUniqueCharacters() {
		final String uniqueCharacterString = "abcdefg";
		boolean result = AllUniqueCharacters_WithAdditionalDataStructure.isAllUniqueCharacters(uniqueCharacterString);
		assertTrue(result, uniqueCharacterString + " has unique characters.");
	}	

	@Test
	public void stringWithNonUniqueCharacters() {
		final String nonUniqueCharacterString = "abcdefa";
		boolean result = AllUniqueCharacters_WithAdditionalDataStructure.isAllUniqueCharacters(nonUniqueCharacterString);
		assertFalse(result, nonUniqueCharacterString + " has non unique characters.");
	}	

	@Test
	public void stringWithNoCharacters() {
		final String emptyString = "";
		boolean result = AllUniqueCharacters_WithAdditionalDataStructure.isAllUniqueCharacters(emptyString);
		assertTrue(result, "The empty String + " + emptyString + " has unique characters.");
	}	
}