#DONE

Feature: Drag and drop element into specific area

#Must drag and drop the 'Drag me' element into the specified area

  Scenario: User can Drag and drop element
    Given the user is on the Droppable page
    Then  the user should be able to drag and drop the Drag me element into the specified area
