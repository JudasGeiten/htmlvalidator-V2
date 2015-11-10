

declare namespace difiFunctions = "www.example.org";
declare variable $doc external;
declare function difiFunctions:is-value-in-sequence
  ( $value as xs:anyAtomicType? ,
    $seq as xs:anyAtomicType* )  as xs:boolean {

   $value = $seq
 };

declare function difiFunctions:to-result-format
($value as node(), $msg as xs:string) as node() {
	<result>
		<element>{$value}</element>
		<errorMessage>{$msg}</errorMessage>
	</result>
};

(: ****** PROTECTED SECTION ****** :)
<results>{
				(: label -> input :)

					for $label in $doc//label
					let $labelinput := $label/@for
					where not(difiFunctions:is-value-in-sequence($labelinput, $doc//input/@id))
					return difiFunctions:to-result-format($label, "Violates lowerbound constraint"),
					(: label <- input :)
					for $input in $doc//input
					let $inputId := $input/@id
					where not(difiFunctions:is-value-in-sequence($inputId, $doc//label/@for))
					return difiFunctions:to-result-format($input, "Violates lowerbound constraint"),
				(: label must contain id :)

					for $label in $doc//label
					where empty($label/@id)
					return difiFunctions:to-result-format($label, "label must contain the attribute id")

}</results>
(: ****** END OF PROTECTED SECTION ****** :)
