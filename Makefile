fixcoin:
	## Fix Coin's Creative Tab
	sed -i 's/.group(NullableMod.NullableCoinsTab)/.group(NullableCoinsTabItemGroup.get())/' src/main/java/tk/merith/nullable/item/*CoinItem.java
	sed -i 's/import tk.merith.nullable.NullableMod;/import tk.merith.nullable.item.NullableCoinsTabItemGroup;/' src/main/java/tk/merith/nullable/item/*CoinItem.java