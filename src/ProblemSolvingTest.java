import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class ProblemSolvingTest {
  @Test
  void testAllStartWithA_trueMixedCase() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "asbestos", "ABBA");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    //assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_falseOneElement() {
    // arrange
    Set<String> input = Set.of("armadillo", "utopia", "Arcanine");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testAllStartWithA_noneStartWithA() {
    // arrange
    Set<String> input = Set.of("banana", "cinnamon", "strawberry");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleElement() {
    // arrange
    Set<String> input = Set.of("banana");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testAllStartWithA_singleLetter() {
    // arrange
    Set<String> input = Set.of("A", "a");
    // act
    boolean actual = ProblemSolving.allStartWithA(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseAllNonEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "Arcanine", "utopia");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_trueOneEmpty() {
    // arrange
    Set<String> input = Set.of("armadillo", "", "utopia", "yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertTrue(actual);
  }

  @Test
  void testHasEmptyString_falseOnly() {
    // arrange
    Set<String> input = Set.of();
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseSpacesOnly() {
    // arrange
    Set<String> input = Set.of("   "); 
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testHasEmptyString_falseOneNonEmpty() {
    // arrange
    Set<String> input = Set.of("yeah");
    // act
    boolean actual = ProblemSolving.hasEmptyString(input);
    // assert
    assertFalse(actual);
  }

  @Test
  void testMaxLength_multipleWords() {
    // arrange
    Set<String> input = Set.of("by", "a", "commodius", "vicus");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(9, actual);
  }

  @Test
  void testMaxLength_equalLengthWords() {
    // arrange
    Set<String> input = Set.of("bored", "hello", "peach", "sweet");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(5, actual);  
  }
    
  @Test
  void testMaxLength_veryLongWord() {
    // arrange
    Set<String> input = Set.of("abcd", "Pneumonoultramicroscopicsilicovolcanoconiosis", "hi", "superhero");
    // act
    int actual = ProblemSolving.maxLength(input);
    // assert
    assertEquals(45, actual);  
  }

  @Test
  void testMinLength_singleWord() {
    // arrange
    Set<String> input = Set.of("joe");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(3, actual);  
  }

  @Test
  void testMinLength_mixedWords() {
    // arrange
    Set<String> input = Set.of("xo", "abc", "dog", "kitty");
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(2, actual);  
  }

  @Test
  void testMinLength_emptySet() {
    // arrange
    Set<String> input = Set.of();
    // act
    int actual = ProblemSolving.minLength(input);
    // assert
    assertEquals(Integer.MAX_VALUE, actual); 
  }
}
