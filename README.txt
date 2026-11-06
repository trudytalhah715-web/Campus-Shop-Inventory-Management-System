CAMPUS SHOP INVENTORY MANAGEMENT SYSTEM
APPLICATION RUNNING INSTRUCTIONS

A. RUNNING THE APPLICATION IN ECLIPSE

1. Open Eclipse IDE.
2. Open the CampusShopInventorySystem project in your workspace.
3. In the Package Explorer, expand:
      CampusShopInventorySystem
          src
              campusshop
4. Confirm that the package contains Product.java and Main.java.
5. Double-click Main.java to open it.
6. Save your work by pressing Ctrl + S.
7. Right-click Main.java in the Package Explorer.
8. Select Run As, then Java Application.
9. If Eclipse asks which application to run, select campusshop.Main.
10. View the output in the Console.

If the Console view is not visible:
- Select Window from the menu.
- Choose Show View, then Console.


C. EXPECTED PROGRAM DEMONSTRATION

When the application runs, the Console displays:
1. The initial details of five campus shop products.
2. A check showing that each product object maintains its own information.
3. The updated exercise book price.
4. The updated exercise book stock quantity.
5. The result of submitting a negative price.
6. The result of submitting a negative stock quantity.

The exercise book's initial price is UGX 3,000 and is then updated to UGX 3,500.
Its initial stock quantity is 50 and is then updated to 70.
Negative prices and negative stock quantities should be rejected, while the previous
valid values remain unchanged.

D. TROUBLESHOOTING

- Check that Main.java and Product.java both begin with: package campusshop;
- Check that both files are inside the campusshop package.
- Confirm that Main.java contains:
      public static void main(String[] args)
- If Eclipse displays old build errors, select Project > Clean, choose the project,
  and clean it. Then run Main.java again.
- Ensure that campusshop.Main is selected when running the application.


