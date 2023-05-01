# ITClinical-Tech-Challenge

# Project structure
The app is composed by 3 independent modules:

1. Engine-interface --> Has one interface (NthCharacterEngine) with one method to retrieve Nth character

2. Engine-interface-impl --> Has implementation of method of the interface NthCharacterEngine
 2.2 The package operation contains the class operation(RetrieveNthCharacterOperation) to retrieve Nth character
 2.3 The class RetrieveNthCharacterOperation has two privete method to attend the task 1 and task 2:
   2.3.1 retrieveNthUpperCharacter -> To retrieve all Nth upperCharacter
   2.3.2 countNumberOfCharacter --> To count of each type of character returned

3. app-test --> Module that contains all the TDD test case

# Pre-requisite to run the test

 JDK 1.8.XX
 Maven 3.6.XX
 
# How to Run test

1. Check the "test" folder of project module: app-test.test.TestTDDApp
