package Selenium;

public class LocatorsStrategy {

	// tag[attr='value']
	// input[name='email'] -- css
	// input[@name='email'] -- xpath

	// xpath vs css:
	// 1. syntax: css is btr than xpath
	// 2. backward: xpath
	// 3. siblings: xpath
	// 4. webtable: xpath
	// 5. comma: css
	// 6. text: xpath
	// 7. dynamic: both
	// 8. SVG Elements: xpath
	// 9. shadow dom : css selector
	// 10. index: both
	// 11. Relative Locators

//CSS child to parent: NA
	// backward traversing in CSS: NA

	// xpath axes:
	// input[@name='email'] -- xpath

	// parent to child:
	// form[@id='hs-login']//input[@id='username']
	// div[@class='private-form__input-wrapper']/input[@id='username']
	// div[@class='private-form__input-wrapper']/child::input[@id='username']
	// select[@id='Form_submitForm_Country']/option
	// select[@id='Form_submitForm_Country']/child::option

	// child to parent:
	// backward traversing in xpath:
	// input[@id='username']/../../../../../../../../../..
	// input[@id='username']/parent::div

	// child to ancestor:
	// input[@id='username']/ancestor::form

}
