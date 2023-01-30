package com.company;

public enum Roll {
        V1,
        V2,
        E;

        public enum RollWithToString {
                V1 {
                        @Override
                        public String toString() {
                                return "Dado 1 ganha com o valor:";
                        }
                },
                V2 {
                        @Override
                        public String toString() {
                                return "Dado 2 ganha com o valor:";
                        }
                },
                E{
                        @Override
                        public String toString() {
                                return "Empate com valor:";
                        }
                };
        }
}

