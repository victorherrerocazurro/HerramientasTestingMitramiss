# Splitting Names

To help personalise our mailshots we want to have the first name and last name of the customer. 
Unfortunately the customer data that we are supplied only contains full names.

The system therefore attempts to break a supplied full name into its constituents by splitting around whitespace.

### [Example](- "basic")

The full name [Jane Smith](- "#name") is [split](- "#result = split(#name)") into first name [Jane](- "?=#result.firstName") and last name [Smith](- "?=#result.lastName").

El nombre completo [Victor Herrero](- "#name") sera [partido](- "#result = split(#name)") en nombre [Victor](- "?=#result.firstName") y apellido [Herrero](- "?=#result.lastName").

El nombre completo [Regina Do Santos](- "#name") sera [partido](- "#result = split(#name)") en nombre [Regina](- "?=#result.firstName") y apellido [Do Santos](- "?=#result.lastName").