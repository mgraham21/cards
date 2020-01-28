package edu.cnm.deepdive.model;

/**
 * Encapsulates the rank of standard playing cards and attach the {@link Rank} to the {@link String} symbols.
 */
public enum Rank {
  ACE,
  TWO,
  THREE,
  FOUR,
  FIVE,
  SIX,
  SEVEN,
  EIGHT,
  NINE,
  TEN,
  JACK,
  QUEEN,
  KING;

  private static final String[] symbols = {
    "A",
    "2",
    "3",
    "4",
    "5",
    "6",
    "7",
    "8",
    "9",
    "10",
    "J",
    "Q",
    "K"
  };

  /**
   * Returns {@link String} instance value for the card rank.
   * @return {@link #symbols}  value.
   */
  public String symbol() {
    return symbols[ordinal()];
  }

}
