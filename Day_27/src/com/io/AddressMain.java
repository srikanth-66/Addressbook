package com.io;
import java.io.IOException;
import java.util.Scanner;
public class AddressMain {
	static int i = 0;
	static UC1 uc1 = new UC1();
	static UC3 uc3 = new UC3();
	static UC4 uc4 = new UC4();
	static UC5 uc5 = new UC5();
	static UC8 uc8 = new UC8();
	static UC9 uc9 = new UC9();
	static UC10 uc10 = new UC10();
	static UC11 uc11 = new UC11();
	static UC12 uc12 = new UC12();
	static Contact contact = new Contact();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to Address Book");
		do {
			System.out.println(
					"1->add person\t 2->print contact\t 3->update contact\t 4->delete contact\t 5->add multiple contact\t 6->search people by city or state\n"
							+ "7->get count by city\t 8->sort by person name\t 9>sort by city\t 10->write and read from file");
			int option = scan.nextInt();
			switch (option) {
			case 1: {
				uc1.add(contact.map, contact.names);
				break;
			}
			case 2: {
				uc9.directoryByStateAndCity(contact.map, contact.names, contact.directoryForCity,
						contact.directoryForState);
				uc1.print(contact.map, contact.names);
				break;
			}
			case 3: {
				uc3.updateDetails(contact.map, contact.names, contact);
				break;
			}
			case 4: {
				uc4.delete(contact.map, contact.names);
				break;
			}
			case 5: {
				uc5.addMultipleContact(contact.map, contact.names, contact);
				break;
			}
			case 6: {
				uc8.showByCity(contact.map, contact.names);
				break;
			}
			case 7: {
				uc10.getCountOfPerson(contact.map, contact.names);
				break;
			}
			case 8: {
				uc11.sortByPersonName(contact.map, contact.names);
				break;
			}
			case 9: {
				uc12.sortByCityName(contact.map, contact.names);
				break;
			}
			case 10: {
				UC13 uc13=new UC13();
				UC13 uc13 = new UC13();
				uc13.fileWrite(contact.map, contact.names);
				uc13.fileRead();

				break;
			}
			case 11: {
				UC14 uc14 = new UC14();
				uc14.fileWriteCsv(contact.map, contact.names);
				uc14.fileReadCsv();
				break;
			}
			}
			System.out.println("want to repeat");
			i = scan.nextInt();
		} while (i == 1);
	}
}
