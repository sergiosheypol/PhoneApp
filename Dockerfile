FROM maven:3.6.3-jdk-11
RUN git clone https://github.com/sergiosheypol/PhoneApp
WORKDIR PhoneApp
CMD mvn spring-boot:run